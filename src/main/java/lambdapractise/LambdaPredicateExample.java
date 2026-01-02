package lambdapractise;

import java.lang.constant.Constable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPredicateExample {

    public static void main(String[] args){

        Predicate<Integer> greaterThan10= i -> (i>10);
        Predicate<Integer> even = i -> i%2 == 0;
        Predicate<Integer> result = greaterThan10.and(even);
        System.out.println(result.test(9));

        Predicate<String> pe = s -> (s.length() >5);
        System.out.println(pe.test("Surya"));

        //function
        Function<Integer,Integer> square = n -> n*n;
        System.out.println(square.apply(5));

        //Consumer
        Consumer<String> print = msg -> System.out.println(msg);
        print.accept("Welcome to java");




    }
}
