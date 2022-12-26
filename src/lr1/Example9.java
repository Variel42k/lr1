package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String month = in.nextLine();

        System.out.println("Введите число дней в месяце");
        int num = in.nextInt();

        System.out.print(lr4case(month,num) ? "Верно" : "Не верно");

    }

    static boolean lr4case(String month, int days) {
        switch (month) {
            case "январь", "май", "март", "июль", "август", "октябрь", "декабрь":
                return days == 31 ? true : false;

            case "февраль":
                return days == 28 ? true : false;

            case "апрель", "июнь", "сентябрь", "ноябрь":
                return days == 30 ? true : false;

            default:
                System.out.println("Месяца не существует");
                return false;

        }
    }
}
