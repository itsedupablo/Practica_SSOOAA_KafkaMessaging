package com.example.transportingrobot.producer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TransportingTaskProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public TransportingTaskProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendTaskCompletion(String taskDetails) {
		String topic = "task-completions"; // Un tópico donde los robots reportan tareas completadas
		kafkaTemplate.send(topic, taskDetails);
		System.out.println("Transporting Robot reported task completion: " + taskDetails);
	}
}