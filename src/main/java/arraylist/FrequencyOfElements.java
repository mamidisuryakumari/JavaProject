package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfElements {

    public void frequencyOfElements(){
        List<String>  namesList = new ArrayList<>(Arrays.asList("Surya","Kumari","Dhanya","Bhavya","Surya",
                "Kumari"));

        Map<String, Long> namesCountList = namesList.stream().
                collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(namesCountList);
    }

    public static void main(String[] args){
        FrequencyOfElements frequencyOfElements = new FrequencyOfElements();
        frequencyOfElements.frequencyOfElements();
    }
}
