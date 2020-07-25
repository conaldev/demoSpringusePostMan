package com.example.demo.controller;

import com.example.demo.service.CountKService;
import com.example.demo.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class Count{
    public int[] a;
    public int k;
}
@RestController
public class CountKController {
    @Autowired
    private CountKService countKService;
    @PutMapping("countK")
    public ResponseEntity<Integer> countK(@RequestBody Count count){
        Integer countK = this.countKService.countK(count.a,count.k);
        return new ResponseEntity<>(countK, HttpStatus.OK);
    }
}
