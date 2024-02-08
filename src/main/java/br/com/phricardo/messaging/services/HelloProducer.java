package br.com.phricardo.messaging.services;

import br.com.phricardo.messaging.model.UserModel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloProducer {

  private final static String TOPIC_NAME = "hello-topic";

  private final KafkaTemplate<String, String> kafkaTemplate;

  public void sendMessage(@NonNull final UserModel userModel) {
      kafkaTemplate.send(TOPIC_NAME, userModel.toString());
  }
}
