package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static int timUSCLN(int a, int b){
        if(a == b){
            return a;
        }else{
            if(a > b){
                a = a - b;
                return timUSCLN(a, b);
            }else{
                b = b - a;
                return timUSCLN(a, b);
            }
        }
    }
    public static int toHop(int n, int k){
        if(k==0  || k==n){
            return 1;
        }else{
            return toHop(n-1,k-1)+ toHop(n-1, k);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<Integer>();
        test.add(4);
        test.add(5);
        test.add(10);
        test.add(15);
        System.out.println(test.get(1));
        System.out.println("hello world");
    }
}
