package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int countp = 0;
        int countn = 0;
        if (a > 0) countp++;
        else if (a < 0) countn++;
        if (b > 0) countp++;
        else if (b < 0) countn++;
        if (c > 0) countp++;
        else if (c < 0) countn++;
        System.out.print("количество отрицательных чисел: " + countn);
        System.out.print("количество положительных чисел: " + countp);
    }
}
