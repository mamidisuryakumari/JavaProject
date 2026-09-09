package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {

    public void findSecondLargestNumber(){
        List<Integer>  numbersList = new ArrayList<>(Arrays.asList(1,5,8,10,6));
        int secondLargestNumber = numbersList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(secondLargestNumber);
    }

    public static void main(String[] args){
        FindSecondLargestNumber findSecondLargestNumber = new FindSecondLargestNumber();
        findSecondLargestNumber.findSecondLargestNumber();
    }
}
