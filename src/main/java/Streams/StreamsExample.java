package Streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    // Given a list of integers, use streams to print all elements.
    List<Integer> numbersList = Arrays.asList(2,5,6,8,9);

    List<String> namesList = Arrays.asList("Surya", "Ravi", "Sita", "kumari", "Surya", "Ravi");

    public void printNumbersFromList() {
        List<Integer> result = numbersList.stream()
                .collect(Collectors.toList());
        System.out.println(result);
    }
//From a list of integers, filter and print only even numbers.

    public void printEvenNumbers() {
        List<Integer> evenNumbers = numbersList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    //From a list of strings, print strings whose length is greater than 5.

    public void printLengthGreaterThanFive() {
        List<String> name = namesList.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(name);
    }

    // Convert a list of strings to uppercase using streams.
    public void printUpperCaseNames() {
        List<String> upperCaseNames = namesList.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);
    }

    // Count how many numbers are greater than 10 in a list.

    public void countOfNumbersGreaterThanTen() {
     /*  Long countNumbers = numbersList.stream()
               .filter(number -> number >10).count();
       System.out.println(countNumbers); */

        //  Long countNumbers = numbersList.stream();

    }

    // Find the first element in a list of integers using streams.

    public void printFirstElement() {
        Optional firstElement = namesList.stream().findFirst();
        System.out.println(firstElement.get());
    }

    //Check if any number in a list is divisible by 7.

    public void checkNumberIsDivisibleBySeven() {
        List<Integer> number = numbersList.stream()
                .filter(a -> a % 7 == 0)
                .collect(Collectors.toList());
        System.out.println(number);

    }

    //Sort a list of integers in ascending order using streams.
    public void sortListOfIntegersInAscendingOrder() {
        List<Integer> sortList = numbersList.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(sortList);
    }

    //Remove duplicate elements from a list using streams.
    public void removeDuplicatesElementsFromList() {
        List<String> removeDuplicateElements = namesList.stream().
                distinct().collect(Collectors.toList());
        System.out.println(removeDuplicateElements);
    }

    //Find the maximum number from a list using streams.
    public void maximumNumberFromAList() {
        Optional<Integer> maxNumber = numbersList.stream()
                .max(Integer::compareTo);
        System.out.println(" Max value : " + maxNumber.get());
    }

    //Find the minimum number from a list using streams.
    public void minimumNumberFromList() {
        Optional<Integer> minNumber = numbersList.stream()
                .min(Integer::compareTo);
        System.out.println("Minimum value: " + minNumber.get());
    }

    //Convert a list of integers into a list of their squares using streams.
    public void convertListOfIntegersIntoTheirSquares() {
        List<Integer> squaresList = numbersList.stream()
                .map(square -> square * 2)
                .collect(Collectors.toList());
        System.out.println(squaresList);
    }

    List<Object> mixedList = List.of(10, "Surya", 20, "Kumar", 30, 40, "Kitti");

    public void findFirstIntegerInMixedList() {
        mixedList.stream()
                .filter(n -> n instanceof Integer)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void findFirstNameInMixedList() {
        mixedList.stream()
                .filter(n -> n instanceof String)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void findNameInMixedList() {
        mixedList.stream()
                .filter(name -> name.equals("Kitti"))
                .findFirst()
                .ifPresent(System.out::println);

    }

    //From a list of strings, group them by their length.
    public void listGroupTheirLength() {
        Object namesLength = namesList.stream().collect(Collectors.groupingBy(
                String::length));
        System.out.println(namesLength);
    }

    //Given a list of integers, separate odd and even numbers into two lists.
    public void separateOddAndEvenNumbers() {
        Map<Boolean, List<Integer>> result =
                numbersList.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = result.get(true);
        List<Integer> oddNumbers = result.get(false);

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }

    //Find the sum of all numbers in a list using streams.
    public void sumOfAllNumbers() {
        Integer sum = numbersList.stream()
                .collect(Collectors.summingInt(n -> n));
        System.out.println(sum);

    }

    //Given a list of words, find all words that start with the letter “A” and sort them.
    public void startWithSLetter() {
        List<String> Swords = namesList.stream()
                .filter(n -> n.startsWith("S")).sorted()
                .collect(Collectors.toList());
        System.out.println(Swords);
    }

    // Count the occurrence of each word in a list of strings.
    public void countOccurrenceOfEachWord() {
        Map<String, Long> wordCount = namesList.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(wordCount);

    }

    // Convert a list of integers into a comma-separated string.
    public void convertIntegersToString() {
        String convert = numbersList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(convert);
    }

    // Find the second highest number from a list using streams.//d
    public void findSecondHighestNumber() {
        Optional secondHighestNumber = numbersList.stream()
                .distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println(secondHighestNumber.get());

    }

    public void highestValue()
    {
            numbersList.stream()
                    .distinct().sorted(Comparator.reverseOrder())
                    .skip(2)
                    .findFirst()
                    .ifPresent(System.out::println);
    }

    //  From a list of strings, find the longest string.
    public void findLongestString() {
        Optional longest = namesList.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longest.get());


    }

    //  From a list of numbers, skip the first 3 elements and print the rest.
    public void skipThreeElements() {
        List<Integer> result = numbersList.stream()
                .skip(3).collect(Collectors.toList());
        System.out.println(result);

        List<Integer> resultl = numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(numbersList.size()-3)
                .collect(Collectors.toList());
        System.out.println(resultl);
    }
//Find top 3 highest numbers from a list.
    public void find3HighestNumber(){
      List<Integer> top3 =   numbersList.stream()
                .sorted((a,b) -> b-a)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3);
    }

    public void printOnlyNonDuplicateValues(){
        List<String> list1 = Arrays.asList("Java", "Python", "C", "JavaScript");
        List<String> list2 = Arrays.asList("Python", "C++", "Java", "Go");
        Stream.of(list1, list2)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(e-> e,Collectors.counting()))
                .entrySet()//Converts the map into a set of key-value pairs
                .stream()
                .filter(entry -> entry.getValue() >1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        StreamsExample se = new StreamsExample();
        se.printOnlyNonDuplicateValues();

    }
}
