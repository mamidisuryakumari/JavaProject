package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

    ArrayList<String> names = new ArrayList<>(Arrays.asList("Surya","Kumari","Dhanya",
            "Bhavya","Kumari","Dileep","Kumari"));

    //Find duplicate elements in ArrayList
    public void duplicateElements(){
    Set<String> unique = new HashSet<>();
    Set<String>  duplicates = new HashSet<>();
    for(String name:names){
        if(!unique.add(name)){
            duplicates.add(name);
        }
    }
    System.out.println(duplicates);

    }
    //using for loop
    public void findDuplicatesUsingForLoop(){
        for(int i=0; i<names.size();i++){
            boolean isDuplicate = false;
            boolean alreadyChecked = false;

            for(int k=0; k<i; k++){
                if(names.get(i).equalsIgnoreCase(names.get(k))){
                    alreadyChecked = true;
                    break;
                }
            }
            if(alreadyChecked){
                continue;
            }
            for(int j=i+1; j<names.size(); j++){
                if(names.get(i).equalsIgnoreCase(names.get(j))){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                System.out.println(names.get(i));
            }
        }
    }

    //using streams
    public void usingStreams(){
        Set<String> unique = new HashSet<>();

        Set<String> duplicates = names.stream()
                .filter(name -> !unique.add(name))
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }


    public static void main(String[] args){
        DuplicateElements dp = new DuplicateElements();
dp.usingStreams();
    }
}
