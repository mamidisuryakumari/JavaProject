package arraylist;

import java.util.*;

public class RemoveDuplicateElements {
//Remove duplicates from ArrayList
ArrayList<String> names = new ArrayList<>(Arrays.asList("Surya","Kumari","Dhanya",
        "Bhavya","Dileep","Kumari","Sri","Kumari"));
    public void removeDuplicateElements(){
        Set<String> unique = new HashSet<>();
        for(String name:names){
            unique.add(name);
        }
        System.out.println("After removing duplicates: " + unique);
    }

    public void usingForLoopRemoveDuplicateElements(){
        for(int i = 0; i < names.size(); i++){
            boolean isDuplicate = false;
            for(int j = i + 1; j < names.size(); j++){
                if(names.get(i).equalsIgnoreCase(names.get(j))){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.println(names.get(i));
            }
        }
    }

    public void removeDuplicateElementsByUsingStream(){
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Surya","Kumari","Dhanya","Bhavya","Dileep","Kumari"));

        List<String> result = names.stream()
                .distinct()
                .toList();
        System.out.println("After removing duplicates: " + result);
    }
    public static void main(String[] args){
        RemoveDuplicateElements rde = new RemoveDuplicateElements();
        rde.usingForLoopRemoveDuplicateElements();
    }
}
