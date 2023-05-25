package org.example;

//Вывести все простые числа от 1 до 1000

public class Task2 {
    public void simpleDigit() {

        for (int i = 2; i <=1001 ; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    isSimple = false;
                    break;
                }
            }
            if(isSimple) {
                System.out.print(i + " ");
            }
        }
    }
}
