package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour) {
        int a = hour*3600;
        return a;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(4));
        System.out.println(convertToSeconds(2));
    }
}
