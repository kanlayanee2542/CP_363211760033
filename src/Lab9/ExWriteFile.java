package Lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 1. สร้างไฟล์ ชื่อ myName.txt
// 2. เขียนข้อมูล ชื่อ-นามสกุล ภาษาอังกฤษ ลงไปในไฟล์ myName.txt
public class ExWriteFile {
    public static void main(String[] args) {

        Path pFile = Paths.get("myName.txt");

        try {
            BufferedReader reader = Files.newBufferedReader(pFile, StandardCharsets.UTF_8);

            String msg = null;
            System.out.println("Text from file: ");
            while ((msg = reader.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//main
}//class
