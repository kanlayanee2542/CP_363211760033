package Lab3;

import java.util.Scanner;

//รับค่าจำนวนเต็ม 10 ครั้งจากผู้ใช้ แสดง ผลรวม และค่าเฉลี่ย ทางจอภาพ (for)
public class Example_For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int totel = 0;
    for (int i = 0; i < 10; i++) {
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        totel += num; // ผลรวมเก็บใน totel
    }
    //display
    System.out.println("Totel: " + totel);
    System.out.println("Average:" + totel/10);
    }
}
