package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(bufferedReader.readLine());
        double res = time % 5;
        if (res >= 0 && res <3)
            System.out.println("зелёный");
        else if (res >= 3 && res <4)
            System.out.println("желтый");
        else if (res >= 4 && res <5)
            System.out.println("красный");
    }
}