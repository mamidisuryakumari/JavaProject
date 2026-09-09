package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArrayList {
    List<Integer>  numbersList = List.of(10,20,30,40);

    public void reverseArrayList(){
        List<Integer> numbersList = new ArrayList<>(List.of(10, 20, 30, 40));
      System.out.println(numbersList.reversed());
      //  Collections.reverse(numbersList);
     //   System.out.println(numbersList);
    }

    //Using streams
    public void reverseUsingStreams() {
        List<Integer> reverseList = numbersList.stream().toList().reversed();
        System.out.println(reverseList);
    }

    //using loop
    public void reverseUsingLoop(){
        List<Integer> reverseList = new ArrayList<>();

        for(int i=numbersList.size()-1; i>=0; i--){
            reverseList.add(numbersList.get(i));
        }
        System.out.println("Reverse array list : " + reverseList);
    }

    public static void main(String[] args){
        ReverseArrayList rs = new ReverseArrayList();
        rs.reverseArrayList();
    }
}
