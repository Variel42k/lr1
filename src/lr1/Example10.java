package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите год рождения");
        int year = in.nextInt();

        System.out.println("Возраст: " + (2022 - year));

    }
}
