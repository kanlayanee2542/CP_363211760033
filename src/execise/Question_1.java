package execise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Your height is M");

        System.out.println("Please Enter Your height is Kg");

        double height ;
        String H = "";

        double weight ;
        String W = "";
        double b = 0.0d;

        try {
            System.out.println("Enter Height");
            H = br.readLine();
            System.out.println("Enter weight");
            W = br.readLine();
        }

        catch (IOException e){
            System.out.println("Error");}

        height = Double.parseDouble(H);
        weight = Double.parseDouble(W);
        b = weight/(height*height);

        System.out.println("BMI"+ b);

        if (18.5<b){
            if(b<22.5)
                System.out.println("normal");
        }
        if (23.0<b){
            if(b<29.9)
                System.out.println("plump");
        }
        if (b>30){
            System.out.println("fat");
        }
        if (b<18.5){
            System.out.println("thin");
        }


         }

    }

