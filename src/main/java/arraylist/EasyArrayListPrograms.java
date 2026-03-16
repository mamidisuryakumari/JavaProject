package arraylist;

import java.util.ArrayList;
import java.util.List;

public class EasyArrayListPrograms {
//Create an ArrayList of integers and add 5 numbers. Print the list.
    public void createListOfIntegres(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);

    }

    //Create an ArrayList of strings with 5 fruit names. Print the first and last element.
    public void printFirstAndLastFruitNames(){
        ArrayList<String> fruitsNames = new ArrayList<>();
        fruitsNames.add("Apple");
        fruitsNames.add("Banana");
        fruitsNames.add("Mango");
        fruitsNames.add("Grapes");

        System.out.println(fruitsNames.get(0));
        System.out.println(fruitsNames.get(fruitsNames.size()-1));

    }

//Add a new element at the second position of an ArrayList.
    public void addNewElement(){
        ArrayList<String> fruitsNames = new ArrayList<>();
        fruitsNames.add("Apple");
        fruitsNames.add("Banana");
        fruitsNames.add("Mango");
        fruitsNames.add("Grapes");
        fruitsNames.add(1,"Kiwi");


    }
    public static void main(String[] args){
EasyArrayListPrograms ealp = new EasyArrayListPrograms();
ealp.addNewElement();
    }
}
