package week1ZadaniaIF;

import java.util.Scanner;

public class Zadanie15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 + number2 == number3 || number1 + number3 == number2 || number2 + number3 == number1){
            System.out.println("TAK");
        } else
            System.out.println("NIE");
    }
}
