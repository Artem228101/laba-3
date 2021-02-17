package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение а");
        int a = in.nextInt();
        System.out.println("Введите значение b");
        int b = in.nextInt();
        System.out.println("Введите значение с");
        int c = in.nextInt();
        System.out.println("Введите значение x");
        int x = in.nextInt();
        System.out.println("Введите значение x нач.");
        int xнач = in.nextInt();
        System.out.println("Введите значение x кон.");
        int xкон = in.nextInt();
        if (c < 0 && b != 0)
        {
            double fx = a * Math.pow(x, 2) + Math.pow(b, 2) * x;
        }
        else if (c > 0 && b == 0)
        {
            double fx = (x + a) / (x + c);
        }
        else {
            System.out.println(x);
            }
                 in.close();
        }
    }

