package com.example.demo.service;

import org.springframework.stereotype.Service;
 class Answer{
        public double decimal;
        public String fraction;
        public String messenger;
        }
@Service
public class EquationOfTheFirstDegreeService {
    public Object result(float a, float b) {
        Answer answer = new Answer();
        if(a==0){
            if(b==0){
                answer.messenger = "Vo so nghiem";
                return answer;
            }
            else{
                answer.messenger = "Vo nghiem";
                return answer;
            }
        }
        else{
            int[] arr = convertToInt(a,b);
            int new_a = arr[0];
            int new_b = arr[1];
            if(new_a<0 && new_b<0){
                new_a = Math.abs(new_a);
                new_b = Math.abs(new_b);
            }else if(new_a<0 && new_b >0){
                new_b= -new_b;
                new_a = Math.abs(new_a);
            }
            int gcd = GCD(Math.abs(new_a),Math.abs(new_b));
            new_a/=gcd;
            new_b/=gcd;
            answer.decimal = a/b;

            answer.fraction =-new_b+"/"+new_a;
            return answer;
        }
    }
    public int[] convertToInt(float a,float b){
        while(a%1!=0 || b%1!=0){
            a*=10;
            b*=10;
        }
        int[] arr = {(int)a,(int)b};
        return arr;
    }
    public int GCD(int a,int b){
        while (a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
}
