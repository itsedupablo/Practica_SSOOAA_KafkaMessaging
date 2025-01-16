package com.example.cuttingrobot.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CuttingTaskProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public CuttingTaskProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendTaskCompletion(String taskDetails) {
        String topic = "task-completions"; // Un tópico donde los robots reportan tareas completadas
        kafkaTemplate.send(topic, taskDetails);
        System.out.println("Cutting Robot reported task completion: " + taskDetails);
    }
}
