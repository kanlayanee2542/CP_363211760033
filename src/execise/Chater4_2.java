package execise;

import java.util.Scanner;

public class Chater4_2 {
    public static void main (String[] args){
        //รับข้อมูล จำนวนเต็ม และจำนวนจริง สลับกัน สังเกตผลการทำงาน

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer:");
        int a = scanner.nextInt();//int
        System.out.print("Enter real name: ");
        double b = scanner.nextDouble();//double
        System.out.println("Enter integer:");
        int c = scanner.nextInt(); //int
        System.out.print("Enter real name: ");
        double d = scanner.nextDouble(); //double
        //display
        System.out.println(a +" "+b+" "+c+" "+d);



    }


}
