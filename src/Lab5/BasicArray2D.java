package Lab5;

import java.util.Scanner;

public class BasicArray2D {

    public static void main (String[] arge){

        int number[][] = new int[2][3]; // 2 * 3 = 6 blocks

        number = inputDatataArray(number);
        showDatainArray(number);
        //find total
        findtotal(number);
        //find max
        findmax(number);
        //find min
        findmin(number);
    }

    private static void findtotal(int[][] number) {
        int total = number [0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length ; j++) {
                total += number [i][j];

            }

        }
        System.out.println("Total value in Array(20): ");
    }

    private static void findmin(int[][] number) {
        int min = number [0][0];
        for (int i = 0; i < number[i].length ; i++) {
            for (int j = 0; j < number [i].length ; j++) {
                if (min >= number [i][j]){
                    min = number [i][j];
                }

            }
            System.out.println("min value in Array(20): ");

        }
    }

    private static void findmax(int[][] number) {
        int max = number[0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length ; j++) {
                if (max <= number [i][j]){
                    max = number [i][j];
                }

            }
            System.out.println("max value in Array(20): ");

        }
    }

    private static void showDatainArray(int[][] number) {
        System.out.println("Data in Array: ");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++){
                System.out.print(number[i][j]+ " ");
            }
            System.out.println();

        }

    }

    private static int[][] inputDatataArray(int[][] number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter integer to array(20):");
        for (int i = 0; i < number.length;i++){
            for (int j = 0; j < number[1].length ; j++) { //column
                System.out.print("number["+i+"]["+j+"]:");
                number[i][j] = sc.nextInt();

            }//forj
        }//for i
        return number;
    }
}//class
