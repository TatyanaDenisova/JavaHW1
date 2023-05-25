package org.example;

import java.util.Scanner;

//Реализовать простой калькулятор
public class Task3 {
    public void calculator(){
        System.out.println("Введите первое число:");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();

        System.out.println("Введите операцию:");
        Scanner c = new Scanner(System.in);
        char operation = c.next().charAt(0);

        System.out.println("Введите второе число:");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();

        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.printf("%d %c %d = %d\n", num1, operation, num2, result);
        a.close();
        b.close();
        c.close();
    }
}
