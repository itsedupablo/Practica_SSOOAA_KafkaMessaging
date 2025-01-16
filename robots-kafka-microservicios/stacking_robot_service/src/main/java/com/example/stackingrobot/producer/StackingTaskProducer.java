package com.example.stackingrobot.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StackingTaskProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public StackingTaskProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendTaskCompletion(String taskDetails) {
		String topic = "task-completions"; // Un tópico donde los robots reportan tareas completadas
		kafkaTemplate.send(topic, taskDetails);
		System.out.println("Stacking Robot reported task completion: " + taskDetails);
	}
}