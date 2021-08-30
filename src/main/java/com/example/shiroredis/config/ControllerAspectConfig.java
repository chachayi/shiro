package com.example.shiroredis.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Describe：
 * @Date 2021/8/24
 * @Author xxy
 */
@Aspect
@Component
public class ControllerAspectConfig {
    private static Logger log = LoggerFactory.getLogger(ControllerAspectConfig.class);

    @Autowired
    private ObjectMapper mapper;

    /**
     * 定义一个切入点表达式，用来确定哪些类需要代理
     */
    @Pointcut("execution(public * com.example.shiroredis.controller..*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        //目标方法的参数
//        for (Object object : joinPoint.getArgs()) {
//            if (
//                    object instanceof MultipartFile
//                            || object instanceof HttpServletRequest
//                            || object instanceof HttpServletResponse
//            ) {
//                if(object instanceof HttpServletRequest){
//                    HttpServletRequest request = (HttpServletRequest)object;
//                    log.debug(request.getContextPath());
//                }
//
//            }
//            try {
//                if (log.isDebugEnabled()) {
//                    log.debug(
//                            joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName()
//                                    + " : request parameter : " + mapper.writeValueAsString(object)
//                    );
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.debug(request.getRequestURI());
    }

    //response，程序可以通过response形参来访问目标方法返回值
    @AfterReturning(returning = "response", pointcut = "webLog()")
    public void doAfterReturning(Object response) throws Throwable {
        if (response != null) {
            log.debug("response parameter : " + mapper.writeValueAsString(response));
        }
    }
}