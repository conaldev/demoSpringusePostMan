package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SumService {

    public Integer sum(int a, int b) {
        return a+b;
    }
}
