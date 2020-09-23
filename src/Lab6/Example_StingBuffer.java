package Lab6;

public class Example_StingBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Kanlayanee Trongkaew");
        str.append("RUTS");
        str.insert(20,' ');
        System.out.println(str);
        str.replace(0,10,"vees");
        System.out.println(str.reverse());
    }
}
