package Lab7;

public class StudentApp {
    public static void main(String[] args) {

        // create object of student class
        Student std1 = new Student();

        std1.setName("Kanlayanee");
        std1.setPerson_id("1288533917651");
        std1.setAge(21);

        displayDataObject(std1);

        Student std2 = new Student();
        std2.setName("Kanlayanee");
        std2.setPerson_id("1288533917651");
        std2.setAge(21);

        displayDataObject(std2);

        std2.setName("Keerayanan");

        Student std3 = new Student("Narongsak","5856545869421",19);

        displayDataObject(std3);

        System.out.println(std3.toString());


    }//main

    private static void displayDataObject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());
    }
}//class
