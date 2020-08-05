package execise;

import java.util.Scanner;

public class Chapter4_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a score 1:");
        int a = scanner.nextInt();
        System.out.println("Enter b score 2:");
        int b = scanner.nextInt();
        System.out.println("Enter c score 3:");
        int c = scanner.nextInt();
        System.out.println("Enter d score 4:");
        int d = scanner.nextInt();
        System.out.println("Enter e score 5:");
        int e = scanner.nextInt();
        System.out.println("Enter f score 6:");
        int f = scanner.nextInt();
        System.out.println("Enter g score 7:");
        int g = scanner.nextInt();
        System.out.println("Enter h score 8:");
        int h = scanner.nextInt();
        System.out.println("Enter i score 9:");
        int i = scanner.nextInt();
        System.out.println("Enter j score 10:");
        int j = scanner.nextInt();

        int totel = a + b + c + d + e + f + g + h + i + j;
        int avg = totel / 10;

        //display result
        System.out.println("Totel : " + totel);
        System.out.println("Average:" + avg);



    }

}
