package org.example.counterservice.ds;

import lombok.Getter;

@Getter
public class CounterServiceRequest {
    private int number;

    public CounterServiceRequest(int number) {
        this.number = number;
    }
}
