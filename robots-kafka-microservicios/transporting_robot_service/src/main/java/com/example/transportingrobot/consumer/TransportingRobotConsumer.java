package com.example.transportingrobot.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransportingRobotConsumer {
	@KafkaListener(topics = "transporting-tasks", groupId = "transporting-group")
	public void consume(String task) {
		System.out.println("Transporting Robot received task: " + task);
	}
}
