package Lab5;

import java.util.ArrayList;

public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        mylist.add("FAH");
        mylist.add("AOM");
        mylist.add("TAE");
        System.out.println(mylist);
        //remove
        mylist.remove(1);
        System.out.println(mylist);
        //insert at index 0
        mylist.add(0,"NUN");
        System.out.println(mylist);

    }
}
