package ArrayList;

import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(100);
        al.add(102);
        al.add(102);
        al.add(490);
        System.out.println("Elements in ArrayList ::");
        for(int num:al){
            System.out.println(num+" ");
            System.out.println(al.indexOf(102));
        }
    }
}
