//package com.example.shiroredis.service.rabbitmq;
//
//import com.example.shiroredis.config.RabbitMQConfig;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * @Describe：
// * @Date 2021/8/26
// * @Author xxy
// */
//
//@Component
//@RabbitListener(queues = RabbitMQConfig.QUEUE_A)
//public class MsgReceiver2 {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
////    @RabbitHandler
////    public void process(String content) {
////        logger.info("MsgReceiver2接收处理队列A当中的消息： " + content);
////    }
//
//}
