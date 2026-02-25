package strings.easystrings;

public class EasyStrings {

    //Create a string "Hello World" and print it.
//Convert a string to uppercase and lowercase.
    public void printMsg(){
        String message = "Hello World";
        System.out.println(message.toUpperCase());
        System.out.println(message);
        System.out.println(message.length());
    }

    //Find the length of a string.
    public void findLengthOfString(){

        String sentense = "This is playwright course";
        String[] wordCount = sentense.split(" ");
      int wordLength =  wordCount.length;
      System.out.println(wordLength);
    }
   // Check if a string starts with "Hello" or ends with "World".
    public void startAndEnd(){
        String sentence = "Hello is world";
       if(sentence.startsWith("Hello") && sentence.endsWith("world")){
           System.out.println("This is true");
        }else{
           System.out.println("This is false");
        }
    }
    //Print the first and last character of a string.
    public void findFirstAndLast(){
        String name ="surya";
char firstCharacter = name.charAt(0);
System.out.println(firstCharacter);
char lastCharacter = name.charAt(name.length()-1);
        System.out.println(lastCharacter);
    }
    //Concatenate two strings "Hello" and "Java".
    public void concatnateTwoStrings(){
        String name1 = "surya";
        String name2 = "kumari";
       String result =  name1.concat(name2);
       System.out.println(result);
    }
    //Compare two strings "Java" and "java" using equals() and equalsIgnoreCase().
    public void compareTwoStrings(){
        String courseName = "Java";
        String courseName1 = "java";
        if(courseName.equalsIgnoreCase(courseName1)) {
            System.out.println("This is equal");
        }else{
            System.out.println("This is not equal");
        }
    }
    //Find the index of a character 'o' in a string.
    public void findIndexOfCharacter(){
        String msg = "World";
        for(int i=0; i<msg.length();i++){
            if(msg.charAt(i) == 'W'){
                System.out.println("Index of o is: "+ i);
                break;
            }
        }
    }
    public void findIndexOfCharacters(){
        String msg = "World";
       int index = msg.indexOf('o');
       if(index != -1){
           System.out.println(index);
       }else{
           System.out.println("Character not found");
       }
    }
    //Extract a substring from a string (e.g., "Hello World", substring "World").
    public void extractSubString(){
        String msg = "Hello World";
       // substring(start) → start to end
        //substring(start, end) → start to end-1
       String result =  msg.substring(6,11);
        System.out.println(result);
    }
    //Replace a character 'l' with 'x' in a string.
    public void replace(){
        String name = "Mallika";
      String result =   name.replace("l","X");
        System.out.println(result);
    }
    //Trim leading and trailing spaces from a string.
    public void trim(){
        String name = "  surya ";
        String after = name.trim();
        System.out.println(after);
    }
    //Split a string by spaces and print each word.
    public void splitSpring(){
       String sentence ="Java is easy to learn";
           String[] result = sentence.split(" ");
           for(String rs:result ){
            System.out.println(rs);
        }
    }
    //Check if a string contains a specific word "Java".
    public void checkAStringContainsASpecificWord(){
        String sentence ="I am learning Java programming";
        String[] result = sentence.split(" ");
        for(String rs:result ){
            if(rs.equals("Java")){
                System.out.println("true");
                break;
            }
        }
    }
    //Convert a string to a character array and print it.
    public void convertStringToaCharacterArray(){
        String course = "Automation";
       /* for(int i=0; i<course.length();i++){
          System.out.println(course.charAt(i));
        }*/
        char[] chars = course.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
    }
    //Print each character of a string using a loop.
    public void printEachCharacter(){
String course = "Selenium";
for(int i=0;i<course.length();i++){
    System.out.println(course.charAt(i));
}
    }
    public static void main(String[] args){
        EasyStrings easyStrings = new EasyStrings();
        easyStrings.printEachCharacter();
    }

}
