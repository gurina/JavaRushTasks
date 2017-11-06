package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.LinkedList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int size = a.length();
        int num = Integer.parseInt(a);
        for (int i = 0; i<size; i++)
        {
            if (num%2==0) even++;
            else if (num%2==1) odd++;
            num = num/10;
           // System.out.println("num = "+num);

        }
        System.out.println("Even: "+even+" Odd: "+odd);



    }
}
