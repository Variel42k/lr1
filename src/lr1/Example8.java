package lr1;

import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      System.out.println("Введите текущий день недели");
        int week = in.nextInt();

        System.out.println("Введите название текущего месяца");
        String month = in.nextLine();

        System.out.println("Введите номер дня в месяце");
        int day = in.nextInt();

        String timeStamp = new SimpleDateFormat("EEEE MM dd").format(Calendar.getInstance().getTime());
        System.out.println("Текущий день недели: " + timeStamp);

        if(timeStamp.equals(week + " " + month + " " + day)){
            System.out.println("Дата введена верно");
        } else {
            System.out.println("Дата введена не верно");
        }

    }
}
