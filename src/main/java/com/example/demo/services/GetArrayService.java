package com.example.demo.services;

import java.util.Random;

public class GetArrayService {
    public GetArrayService() {
    }
    public int[] GetRandomArray(){
        int[] myList = new int[1000];
        int number = 0;
        Random rand = new Random();
        for(int i = 0;i<1000;i++){
            number = number+rand.nextInt(2)+1;//每次随机增加1或2
            myList[i] = number;
        };
        return myList;
    }
}
