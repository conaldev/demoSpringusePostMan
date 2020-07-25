package com.example.demo.service;

import org.springframework.stereotype.Service;
@Service
public class CountKService {
    public Integer countK(int[] a, int k){
        int count =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==k)
                count++;
        }
        return count;
    }
}
