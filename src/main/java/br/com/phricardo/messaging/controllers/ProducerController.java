package br.com.phricardo.messaging.controllers;

import br.com.phricardo.messaging.model.UserModel;
import br.com.phricardo.messaging.services.HelloProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
@RequiredArgsConstructor
public class ProducerController {


    private final HelloProducer helloProducer;

    @PostMapping
    public void producer(@RequestBody UserModel userModel) {
        helloProducer.sendMessage(userModel);
    }
}
