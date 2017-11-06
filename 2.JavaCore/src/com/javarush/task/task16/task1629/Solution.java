package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        private String result;

        public void run() {
            try {
                result = reader.readLine() + " " + reader.readLine() + " " + reader.readLine();
            } catch (Exception e) {
                System.out.print(e.getStackTrace());
            }
        }

        public void printResult() {
            System.out.println(result);
        }
    }
    //add your code here - добавьте код тут
}
