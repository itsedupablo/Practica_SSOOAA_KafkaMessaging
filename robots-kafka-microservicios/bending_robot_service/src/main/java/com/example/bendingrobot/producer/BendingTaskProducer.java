package com.example.bendingrobot.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BendingTaskProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public BendingTaskProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendTaskCompletion(String taskDetails) {
        String topic = "task-completions"; // Un tópico donde los robots reportan tareas completadas
        kafkaTemplate.send(topic, taskDetails);
        System.out.println("Bending Robot reported task completion: " + taskDetails);
    }
}
