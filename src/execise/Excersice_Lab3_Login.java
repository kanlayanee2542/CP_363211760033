package execise;

import java.util.Scanner;

public class Excersice_Lab3_Login{
    public static void main (String[] args){
        //define do

        String username = "mit212";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);

        int count = 0;
        do {
            System.out.print("username:");
            String u = scanner.nextLine();
            System.out.print("Password");
            String p = scanner.nextLine();
            if (u.equals(username) && p.equals(password)) {
                System.out.println("Welcom, to MT System.");
                break;
            } else {
                System.out.println("Username or Password not corected.");
                count++;
                if (count == 3){
                    System.out.println("Your account has been locked. Pleae,contact admin");
                }

            }

        }while (count < 3 );
    }

}



