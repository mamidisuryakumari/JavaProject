package arraylist;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EasyArrayListPrograms {

    //Create an ArrayList of integers and add 5 numbers. Print the list.
    public void createListOfIntegres() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        List<Integer> resultList = new ArrayList<>();
        System.out.println(resultList.size());
    }

    //Create an ArrayList of strings with 5 fruit names. Print the first and last element.
    public void printFirstAndLastFruitNames() {
        ArrayList<String> fruitsNames = new ArrayList<>();
        fruitsNames.add("Apple");
        fruitsNames.add("Banana");
        fruitsNames.add("Mango");
        fruitsNames.add("Grapes");

        System.out.println(fruitsNames.get(1));
        System.out.println(fruitsNames.get(fruitsNames.size() - 1));

    }

    //Add a new element at the second position of an ArrayList.
    public void addNewElement() {
        ArrayList<String> fruitsNames = new ArrayList<>();
        fruitsNames.add("Apple");
        fruitsNames.add("Banana");
        fruitsNames.add("Mango");
        fruitsNames.add("Grapes");
        fruitsNames.add(1, "Kiwi");


    }

    public void evenNumbers() {
        List<Integer> number = List.of(2, 1, 5, 6, 8);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 == 0) {
                result.add(number.get(i));
            }
        }
        System.out.println(result);
    }

    //Remove an element at a specific index.
    public void removeElement() {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 8));
        numberList.remove(1);
        System.out.println(numberList);
    }

    //Check whether an element exists in the list.
    public void existingElement() {
        List<String> namesList = Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya");
        for (String name : namesList) {
            if (name.equalsIgnoreCase("kumari")) {
                System.out.println("Element is existed");
                return;
            }
        }
        System.out.println("Element is not existed");
    }

    public void existingElementUsingStream() {
        List<String> namesList = Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya");
        System.out.println(
                namesList.stream().anyMatch(name -> name.equals("Kumari"))
        );
    }

    //Get an element at a given index.
    public void getElement() {
        List<String> namesList = Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya");
        System.out.println(namesList.get(2));
    }

    //Update a value at a particular index.
    public void updateValue() {
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya"));
        namesList.set(1, "Dileep");
        System.out.println(namesList);
    }

    //7.	Iterate through an ArrayList using:
    //o	for loop
    //o	enhanced for loop
    //o	iterator
    public void usingForLoop() {
        List<String> namesList = Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya");
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }
    }

    public void usingEnhancedForllop() {
        List<String> namesList = Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya");
        for (String names : namesList) {
            System.out.println(names);
        }
    }

    public void usingIterator() {
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya"));
        Iterator<String> iterator = namesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
      //Get element by index
        public void getElementByIndex(){
            List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya"));
            System.out.println(namesList.get(1));
        }
   //Update element in ArrayList
    public void updateElement(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya"));
        namesList.set(1,"Sri");
        System.out.println(namesList);
    }

    //Remove element by index
    public void removeElementByIndex(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya"));
        namesList.remove(1);
        System.out.println(namesList);
    }

    //Remove element by value
    public void removeElementByValue(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya","Dhanya"));
       for(int i = namesList.size()-1; i>=0; i--){
           if(namesList.get(i).equals("Dhanya")){
               namesList.remove(i);
           }
       }
       System.out.println(namesList);
    }
    //Check if ArrayList is empty
    public void checkArrayListEmpty(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya","Dhanya"));
        System.out.println(namesList.isEmpty());
    }

    //10.	Find size of ArrayList
    public void findSizeOfArrayLis(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya","Dhanya"));
        System.out.println(namesList.size());
    }
   //Search element in ArrayList
    public void searchElementInArrayList(){
        List<String> namesList = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya", "Bhavya"));
       if(namesList.contains("Dhanya")){
          System.out.println("Element is found");
        }else{
           System.out.println("Element is not found");
       }
    }
    //Sort ArrayList in ascending order
    public void sortArrayListAscendingOrder(){
        List<Integer>  numbersList = new ArrayList<>(Arrays.asList(40,50,10,20,30));
       // Collections.sort(numbersList);
        numbersList.sort(Comparator.naturalOrder());
        System.out.println(numbersList);
    }
    //Sort ArrayList in descending order
    public void sortArrayListDescendingOrder(){
        List<Integer>  numbersList = new ArrayList<>(Arrays.asList(40,50,10,20,30));
        Collections.sort(numbersList,Collections.reverseOrder());
       // numbersList.sort(Comparator.reverseOrder());
        System.out.println(numbersList);
    }

    //Copy one ArrayList to another
    public void copyOneArrayListToAnother(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya"));
        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);

       /* List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya"));
          List<String> list2 = new ArrayList<>();
          for(String name : list1){
            list2.add(name);
        }
         System.out.println(list2);*/
    }

    public void copyArrayListUsingStream(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya"));
        List<String> list2 = list1.stream()
                .toList();
        System.out.println(list2);
    }

    //Merge two ArrayLists
    public void mergeTwoArrayLists(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Sri","Dil"));
        for(String name:list1){
            list2.add(name);
        }
        System.out.println(list2);
    }
    //Merge two arraylists
    public void mergeTwoArrayListsUsingStream(){

        List<String> list1 = new ArrayList<>(Arrays.asList("Surya", "Kumari", "Dhanya"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Sri","Dil"));

        List<String> result = Stream.concat(list1.stream(), list2.stream())
                .toList();

        System.out.println(result);
    }

    public void convertArrayListToArray(){
        List<String> namesList = new ArrayList<>(Arrays.asList(
                "Surya", "Kumari", "Dhanya", "Bhavya"));
        String[] arr = namesList.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
    }


public void convertArrayToArrayList(){
        String[] arr = {"Surya", "Kumari", "Dhanya", "Bhavya"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
}


    public static void main(String[] args) {
        EasyArrayListPrograms ealp = new EasyArrayListPrograms();
        ealp.convertArrayListToArray();
    }
}
