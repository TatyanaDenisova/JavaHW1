package org.example;

import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n),n! (произведение чисел от 1 до n)
public class Task1 {
    public void triangleFactorial () {
        System.out.printf("Введите число n ");
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        int triangle = 0;
        int factorial = 1;
        for (int i = 1; i < num+1 ; i++) {
            triangle += i;
            factorial *= i;
        }
        System.out.printf("треугольноe число равно: %d \n", triangle);
        System.out.printf("факториал числа %d: равен %d \n", num, factorial);
        in.close();



    }

}
