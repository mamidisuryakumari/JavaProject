package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleElementsRandomly {

    public void shuffleElementsRandomly(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya","Sri"));
        Collections.shuffle(namesList);
        System.out.println(namesList);
    }

    public void checkAnagram(){

        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Kumari", "Surya", "Dhanya"));

        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.equals(list2)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static void main(String[] args){
        ShuffleElementsRandomly shuffleElementsRandomly = new ShuffleElementsRandomly();
        shuffleElementsRandomly.checkAnagram();
    }
}
