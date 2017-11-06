package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        int count = 0;
        int b;
                while (true)
                {
                    b = Integer.parseInt(bufferedReader.readLine());
                    if (b==(-1)) {
                        System.out.print(a/count);
                        break;
                    }
                    else count ++;
                    a = a + b;
                }
    }
}

