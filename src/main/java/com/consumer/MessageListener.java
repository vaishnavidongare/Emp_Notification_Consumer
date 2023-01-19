package com.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
	
	@RabbitListener(queues = MQConfig.QUEUE)
	public void listener(Employee employee) {
		System.out.println(employee);
	}
}
