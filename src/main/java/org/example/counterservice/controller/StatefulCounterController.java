package org.example.counterservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.counterservice.ds.CounterServiceResponse;
import org.example.counterservice.service.MutableCounter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("counter/stateful")
@RequiredArgsConstructor
public class StatefulCounterController {
    private final MutableCounter mutableCounter;
    @PostMapping("/countUp")
    public CounterServiceResponse countUp(){

        mutableCounter.countUp();
        return new CounterServiceResponse(mutableCounter.getNumber());
    }
}
