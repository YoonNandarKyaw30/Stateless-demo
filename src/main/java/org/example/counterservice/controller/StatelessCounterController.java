package org.example.counterservice.controller;

import org.example.counterservice.ds.CounterServiceRequest;
import org.example.counterservice.ds.CounterServiceResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter/stateless")
public class StatelessCounterController {
    @PostMapping("/countUp")
    public CounterServiceResponse countUp(@RequestBody CounterServiceRequest request){
        return new CounterServiceResponse(
                request.getNumber() +1
        );
    }
}