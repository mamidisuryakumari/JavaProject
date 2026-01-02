package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsExample {

   // Given a list of integers, use streams to print all elements.
   List<Integer> numbersList = Arrays.asList(1,2,3,14,5,10,11,16,7);

   List<String>  namesList = Arrays.asList("Surya" ,"Ram", "Sita" ,"kumari","Surya");

   public void printNumbersFromList(){
       List<Integer> result = numbersList.stream()
               .collect(Collectors.toList());
        System.out.println(result);
    }
//From a list of integers, filter and print only even numbers.

    public void printEvenNumbers(){
       List<Integer> evenNumbers = numbersList.stream()
               .filter(n -> n%2 == 0)
               .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    //From a list of strings, print strings whose length is greater than 5.

public void printLengthGreaterThanFive(){
       List<String> name = namesList.stream()
               .filter(s -> s.length()>=5)
               .collect(Collectors.toList());
    System.out.println(name);
}

   // Convert a list of strings to uppercase using streams.
    public void printUpperCaseNames(){
        List<String> upperCaseNames= namesList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);
    }

   // Count how many numbers are greater than 10 in a list.

    public void countOfNumbersGreaterThanTen(){
       Long countNumbers = numbersList.stream()
               .filter(number -> number >10).count();
       System.out.println(countNumbers);

    }

   // Find the first element in a list of integers using streams.

    public void printFirstElement(){
       Optional firstElement = namesList.stream().findFirst();
       System.out.println(firstElement);
    }

    //Check if any number in a list is divisible by 7.

    public void checkNumberIsDivisibleBySeven(){
       List<Integer> number = numbersList.stream()
               .filter(a -> a%7 == 0)
               .collect(Collectors.toList());
        System.out.println(number);

    }

    //Sort a list of integers in ascending order using streams.
    public void sortListOfIntegersInAscendingOrder(){
      List<Integer> sortList = numbersList.stream()
              .sorted().collect(Collectors.toList());
      System.out.println(sortList);
    }

    //Remove duplicate elements from a list using streams.
    public void removeDuplicatesElementsFromList(){
       List<String> removeDuplicateElements = namesList.stream().
               distinct().collect(Collectors.toList());
       System.out.println(removeDuplicateElements);
    }

    //Find the maximum number from a list using streams.
    public void maximumNumberFromAList(){


    }
    //Find the minimum number from a list using streams.

    //Convert a list of integers into a list of their squares using streams.
    public void convertListOfIntegersIntoTheirSquares(){
       List<Integer> squaresList = numbersList.stream()
               .map(square -> square *2)
               .collect(Collectors.toList());
        System.out.println(squaresList);
    }


    public static void main(String[] args){

        StreamsExample se = new StreamsExample();
        se.convertListOfIntegersIntoTheirSquares();

    }
}
