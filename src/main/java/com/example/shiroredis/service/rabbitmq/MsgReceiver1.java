package com.example.shiroredis.service.rabbitmq;

import com.example.shiroredis.config.RabbitMQConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Describe：
 * @Date 2021/8/26
 * @Author xxy
 */

@Component
//@RabbitListener(queues = RabbitMQConfig.QUEUE_A)
public class MsgReceiver1 {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "QUEUE.A", durable = "true"),
                    exchange = @Exchange(value = "my-mq-exchange_A", type = "direct"),
                    key = "spring-boot-routingKey_A"
            )
    )
    @RabbitHandler
    public void process(String content) {
        logger.info("MsgReceiver1接收处理队列A当中的消息： " + content);
    }

}
