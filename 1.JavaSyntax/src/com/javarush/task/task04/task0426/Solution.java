package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        if (a == 0) System.out.print("ноль");
        else if ((a < 0) && ((a % 2) == 0)) System.out.print("отрицательное четное число");
        else if ((a < 0) && ((a % 2) != 0)) System.out.print("отрицательное нечетное число");
        else if ((a > 0) && ((a % 2) == 0)) System.out.print("положительное четное число");
        else if ((a > 0) && ((a % 2) != 0)) System.out.print("положительное нечетное число");
    }
}
