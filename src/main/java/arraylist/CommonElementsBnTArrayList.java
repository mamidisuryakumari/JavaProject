package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsBnTArrayList {

    public void commonElementsBnTArrayList(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya","Sri"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Sri","Dil","Surya","Sri"));
        for(int i=0; i< list1.size(); i++){
            for(int j=0; j< list2.size(); j++){
                if(list1.get(i).equals(list2.get(j))) {
                    System.out.println(list1.get(i));
                    break;
                }
            }
        }
    }

    public void commonElementsBnTArrayListUsingStream() {
        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya","Sri"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Sri","Dil","Surya","Sri"));
        List<String> result = list1.stream()
                .filter(list2::contains)
                .toList();
        System.out.println(result);
    }

    public static void main(String[] args){
        CommonElementsBnTArrayList commonElementsBnTArrayList = new CommonElementsBnTArrayList();
        commonElementsBnTArrayList.commonElementsBnTArrayListUsingStream();
    }
}
