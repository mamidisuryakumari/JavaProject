package lambdapractise;


import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Surya");
        names.add("kumari");

        names.forEach(name -> System.out.println(name));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        numbers.sort((a, b) -> a - b);

        System.out.println(numbers);

    }
}
