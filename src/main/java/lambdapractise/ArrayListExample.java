package lambdapractise;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class ArrayListExample {


    public static void main(String[] args){


        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("green");
        colors.add("green");
        colors.add("Yellow");
        colors.add("White");
        colors.add("cream");
        colors.add("Skin");
        for(String colrs:colors){
            System.out.println(colrs);
        }

        //example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Appele");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Mango");

        for(String fruit:fruits){
            System.out.println((fruit));
        }

    }
}
