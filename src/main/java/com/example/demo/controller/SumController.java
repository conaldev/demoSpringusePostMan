package com.example.demo.controller;

import com.example.demo.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


class Sum {
    public int a,b;
}
@RestController
public class SumController {
    @Autowired
    private SumService sumService;
    @GetMapping("sum")
    public ResponseEntity<Integer> sum(@RequestParam int a, @RequestParam int b) {
        Integer sum = this.sumService.sum(a,b);
        return new ResponseEntity<>(sum, HttpStatus.OK);
    }
    @PostMapping("sum/{a}/{b}")
    public ResponseEntity<Integer> sum1(@PathVariable int a, @PathVariable int b){
        Integer sum1 = this.sumService.sum(a,b);
        return new ResponseEntity<>(sum1,HttpStatus.OK);
    }
    @PutMapping("sum")
    public ResponseEntity<Integer> sum2(@RequestBody Sum sum) {
        Integer sum2 = this.sumService.sum(sum.a, sum.b);
        return new ResponseEntity<>(sum2,HttpStatus.OK);
    }
    @PutMapping("sum2")
    public ResponseEntity<String> sum3(@ModelAttribute("a") int a, @ModelAttribute("b") int b, @ModelAttribute("file") MultipartFile file){
        Integer sum3 = this.sumService.sum(a,b);
        return new ResponseEntity<>(file.getOriginalFilename(),HttpStatus.OK);
    }

}
