package com.example.bendingrobot.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BendingRobotConsumer {

    @KafkaListener(topics = "bending-tasks", groupId = "bending-group")
    public void consume(String task) {
        System.out.println("Bending Robot received task: " + task);
        // Aquí podrías añadir lógica específica para procesar la tarea recibida
    }
}
