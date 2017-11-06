package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] a = new int[15];
        int chet=0;
        int nechet=0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<15; i++)
        {
            a[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i=0; i<a.length;i=i+2) {
            chet = chet + a[i];
        }
        for (int i=1; i<a.length;i=i+2) {
            nechet = nechet + a[i];
        }
        if (nechet>chet) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
