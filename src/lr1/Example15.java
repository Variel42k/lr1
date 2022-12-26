package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа по очереди");
        double num = in.nextDouble();
        double num1 = in.nextDouble();
        System.out.println("Сумма: " + (num + num1));
        System.out.println("Разность: " + (num - num1));
    }
}
