package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArraylists {



    public void compareArrayListsWithOrder(){
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Surya","Kumari","Dileep"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Surya","Kumari","Dileep"));
        if (list1.equals(list2)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Boths are not equal");
        }
    }

    public void compareArrayListsWithOutOrder(){
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Surya","Kumari","Dileep"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Kumari","Dileep","Surya"));

        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.equals(list2)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Boths are not equal");
        }
    }

    public static void main(String[] args){
        CompareTwoArraylists compareTwoArraylists = new CompareTwoArraylists();
        compareTwoArraylists.compareArrayListsWithOutOrder();
    }
 }
