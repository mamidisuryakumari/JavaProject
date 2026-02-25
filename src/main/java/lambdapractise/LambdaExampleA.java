package lambdapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Add {
    int addNumbers(int a, int b);
}

@FunctionalInterface
interface Message {
    void message();
}


public class LambdaExampleA {

    public void printMsg() {
        Message msg = () -> System.out.println("Hello kumari");
        msg.message();
    }

    public void addNumbers() {
        Add ad = (a, b) -> a + b;
        System.out.println(ad.addNumbers(10, 20));
    }

    public void printArrayList(){

        List<String> arrayList = Arrays.asList("surya","kumari","Ravi");
        arrayList.forEach(name-> System.out.println(arrayList));

    }

    public static void main(String[] args) {
        LambdaExampleA lambdaExampleA = new LambdaExampleA();
        lambdaExampleA.printArrayList();
    }
}


