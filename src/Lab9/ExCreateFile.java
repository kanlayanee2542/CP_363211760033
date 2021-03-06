package Lab9;

import java.io.File;
import java.io.IOException;

public class ExCreateFile {
    public static void main(String[] args) {
        File myFile = new File("exFile.txt");
        //createNewFile()
        try {
            if (myFile.createNewFile()){
                System.out.println("Created file is successful.");
            }else {
                System.out.println("Can not create file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //canRead()
        if (myFile.canRead()){
            System.out.println("Can read this file.");
        }else {
            System.out.println("Can not read this file.");
        }
        //canWrite()
        if (myFile.canWrite()){
            System.out.println("Can write this file.");
        }else {
            System.out.println("Can not write this file.");
        }
        //exists()
        if (myFile.exists()){
            System.out.println("this file is exists.");
        }else {
            System.out.println("this file is not exists.");
        }

        //getname()
        System.out.println("File name is"+myFile.getName());
        //getPath()
        System.out.println("Path file is"+myFile.getPath());
        //renameTo()
        File rFile = new File("myNewfile.txt");
        if (myFile.renameTo(rFile)){
            System.out.println("File name is already changed.");
        }else {
            System.out.println("Can not changed file name.");
        }



    }//main
}//clas

