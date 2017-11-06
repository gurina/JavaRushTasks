package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int size = a.length();
        int b = Integer.parseInt(a);
        if ((b > 0) && (size == 1) && (b % 2 == 0)) System.out.print("четное однозначное число");
        else if ((b > 0) && (size == 1) && (b % 2 != 0)) System.out.print("нечетное однозначное число");
        else if ((b > 0) && (size == 2) && (b % 2 == 0)) System.out.print("четное двузначное число");
        else if ((b > 0) && (size == 2) && (b % 2 != 0)) System.out.print("нечетное двузначное число");
        else if ((b > 0) && (size == 3) && (b % 2 == 0)) System.out.print("четное трехзначное число");
        else if ((b > 0) && (size == 3) && (b % 2 != 0)) System.out.print("нечетное трехзначное число");
    }
}
