package br.com.phricardo.messaging.services;

import br.com.phricardo.messaging.model.UserModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {

    private final static String TOPIC_NAME = "hello-topic";

    // O Kafka particiona os tópicos, e os consumidores de um mesmo grupo (groupId) podem ler diferentes partições do mesmo tópico.
    // A carga de mensagens é distribuída entre os consumidores, permitindo o processamento paralelo.
    @KafkaListener(topics = TOPIC_NAME, groupId = "group-1")
    private void messageReceiver(String message) {
        System.out.println(message);
    }
}
