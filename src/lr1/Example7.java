package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = in.nextLine();


        System.out.println("Введите число полных лет");
        int num = in.nextInt();


        System.out.printf("Имя и возраст: %s %d", name, num);
        in.close();
    }
}
