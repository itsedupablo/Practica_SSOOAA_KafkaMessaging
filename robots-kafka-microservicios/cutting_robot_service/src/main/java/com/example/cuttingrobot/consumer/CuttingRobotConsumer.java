package com.example.cuttingrobot.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CuttingRobotConsumer {

    @KafkaListener(topics = "cutting-tasks", groupId = "cutting-group")
    public void consume(String task) {
        System.out.println("Cutting Robot received task: " + task);
        // Aquí podrías añadir lógica específica para procesar la tarea recibida
    }
}
