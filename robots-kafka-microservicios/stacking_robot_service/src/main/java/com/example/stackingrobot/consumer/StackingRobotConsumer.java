package com.example.stackingrobot.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StackingRobotConsumer {
	@KafkaListener(topics = "stacking-tasks", groupId = "stacking-group")
	public void consume(String task) {
		System.out.println("stacking Robot received task: " + task);
	}
}
