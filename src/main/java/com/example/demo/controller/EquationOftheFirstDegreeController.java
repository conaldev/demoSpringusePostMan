package com.example.demo.controller;

import com.example.demo.service.EquationOfTheFirstDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquationOftheFirstDegreeController {
    @Autowired
    private EquationOfTheFirstDegreeService equationOfTheFirstDegreeService;
    @GetMapping("equation")
    public ResponseEntity<Object> equation(@RequestParam float a, @RequestParam float b){
        Object result = this.equationOfTheFirstDegreeService.result(a,b);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
