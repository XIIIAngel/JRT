package com.javarush.task.task02.task0201;

/* 
Реализуем метод print
*/
public class Solution {
    public static void main(String[] args) {
        print("Java easy to learn!");
    }

    public static void print(String s) {
        int x = 0;

       while (x < 5){
           System.out.println(s);
           x = x+1;
       }
    }
}
