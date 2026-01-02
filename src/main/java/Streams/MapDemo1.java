package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args){
        List<Integer> numbersList = Arrays.asList(2,3,5,6,8);
        List<Integer> resultList = new ArrayList<>();
      // resultList =  numbersList.stream().map(n->n*3).collect(Collectors.toList());
      // System.out.println(resultList);
       // numbersList.stream().map(n->n*3).forEach(System.out::println);
        numbersList.stream().map(n->n*3).forEach(result->System.out.println(result));
    }
}
