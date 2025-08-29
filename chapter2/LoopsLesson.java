package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    static boolean op(){
        return true;
    } 
    public static void main(String[] args) {
        byte a = 1;
        while(a<=10)
            System.out.println("a = "+a++);
       

        do
            System.out.println("do while : a = "+a--);
        while (a<10);
        System.out.println("end of program");
        byte[] oddNums = {2,4,6,8,10};
        byte p = 0;
        do
            System.out.println("odd number:"+oddNums[p++]);
        while (p<oddNums.length);
        
    }
}