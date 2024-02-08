package br.com.phricardo.messaging.services;

import br.com.phricardo.messaging.model.UserModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {

    private final static String TOPIC_NAME = "hello-topic";

    @KafkaListener(topics = TOPIC_NAME, groupId = "group-1")
    private void messageReceiver(String message) {
        System.out.println(message);
    }
}
