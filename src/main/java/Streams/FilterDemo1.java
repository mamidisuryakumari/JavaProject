package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Apple","Banana","Cherry","Strawberry");
        List<String> fruitList = new ArrayList<>();
    //    fruits.stream().filter(f->f.length()>6).forEach(System.out::println);

        for(String fruit:fruits){
            if(fruit.length() > 6) {
                fruitList.add(fruit);
                System.out.println(fruitList);
            }

        }
    }
}
