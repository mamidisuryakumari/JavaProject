package lambdapractise;

import java.util.List;

public class EvenNumbers {

    public static void main(String[] args){

        List<Integer> numbers = List.of(1,3,5,9,7,8,7,10);
        numbers.stream()
                .filter(number ->number%2==0)
                .forEach(System.out::println);
    }
}
