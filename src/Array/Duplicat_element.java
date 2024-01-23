package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicat_element {
    public static  List<Integer> element(int arr[]){

        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr){
            if(hs.contains(i))
            {
                al.add(i);
            }else{
                hs.add(i);
            }


        }
        return  al;
    }

    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(Duplicat_element.element(nums));
    }
}
