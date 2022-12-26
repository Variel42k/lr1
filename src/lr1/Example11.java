package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        System.out.println("Введите имя и год рождения");
        System.out.println("Имя: " +(new Scanner(System.in).nextLine())+ " Возраст: " + (2022 - new Scanner(System.in).nextInt()));
    }
}
