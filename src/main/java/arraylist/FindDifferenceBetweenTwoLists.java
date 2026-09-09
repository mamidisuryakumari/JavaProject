package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDifferenceBetweenTwoLists {

    public void findDifferenceBetweenTwoListsUsingStreams() {
        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya","Sri"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Sri","Dil","Surya","Sri"));
        List<String> result = list1.stream()
                .filter(e -> !list2.contains(e))
                .toList();
        System.out.println(result);
    }

    public void findDifferenceBetweenTwoLists(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya","Sri"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Sri","Dil","Surya","Sri"));

        for(int i=0; i< list1.size(); i++){
            boolean found = false;
            for(int j=0; j< list2.size(); j++){
                if(!list1.get(i).equals(list2.get(j))) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(list1.get(i));
            }
        }
    }

    public static void main(String[] args){
        FindDifferenceBetweenTwoLists findDifferenceBetweenTwoLists = new FindDifferenceBetweenTwoLists();
        findDifferenceBetweenTwoLists.findDifferenceBetweenTwoLists();
    }
}
