package Lab3;

import java.util.Scanner;

public class Example_if_else {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter integer 1: ");
            int x = scanner.nextInt();
            System.out.print("Enter integer 2: ");
            int y = scanner.nextInt();
            //test condition
            if (x > y) {
                System.out.println(x+" more.then" + y);
            } else {
                System.out.println(x+" less.then" + y);
            }



        }
}
