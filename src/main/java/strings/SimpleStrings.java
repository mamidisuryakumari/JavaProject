package strings;

public class SimpleStrings {

    String name = "Surya Kumari";
    String message = "Hello World";

    //Create a string "Hello World" and print it.
    public void printString() {
          System.out.println(message);
    }


    public void printStringStreams() {
        System.out.println(message);
    }

    //Find the length of a string.
    public void findLengthOfString() {
        name = name.replace(" ", "");
        int length = name.length();
        System.out.println(length);
    }

    //Convert a string to uppercase and lowercase.
    public void uppercaseAndLowercase() {
        String uppercase = name.toUpperCase();
        System.out.println(uppercase);
        String lowercase = name.toLowerCase();
        System.out.println(lowercase);
    }

    //Check if a string starts with "Hello" or ends with "World".
    public void startHandEndW() {
        if (message.startsWith("Hello") && message.endsWith("World")) {
            System.out.println("String start with 'Hello' and ends with 'World'");
        } else {
            System.out.println("String does not start with 'Hello' and ends with 'World'");
        }
    }

    //Print the first and last character of a string.
    public void firstAndLast() {
        String sName = "SuryaKumari";
        char firstCharacter = sName.charAt(0);
        char lastCharacter = sName.charAt(sName.length() - 1);
        System.out.println(firstCharacter);
        System.out.println(lastCharacter);
    }

    //Concatenate two strings "Hello" and "Java".
    public void concatenateTwoString() {
        String s1 = "Hello";
        String s2 = "Java";
        System.out.println(s1.concat(s2));
    }

    //Compare two strings "Java" and "java" using equals() and equalsIgnoreCase().
    public void compareTwoStrings() {
        String s3 = "Java";
        String s4 = "java";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }

    //Find the index of a character 'o' in a string
    public void findCharacter() {
        String o = "output";
        System.out.println(o.indexOf('p'));
    }

    //Extract a substring from a string (e.g., "Hello World", substring "World").
    public void findSubstring() {
        System.out.println(message.substring(6, 11));
    }

    //Replace a character 'l' with 'x' in a string.
    public void replaceString() {
        String r = "Replace";
        System.out.println(r.replace("l", "x"));

    }

    //Trim leading and trailing spaces from a string.
    public void removeSpaces() {
        String text = "   Hello World   ";
        System.out.println(text.trim());
    }

    //Split a string by spaces and print each word.
    public void splitSpace() {
        String text = "Java Streams are very powerful";
        String[] words = text.split(" ");
        int count = words.length;
        System.out.println(count);
        for (String word : words) {
            System.out.println(word);
        }
    }

    //Check if a string contains a specific word "Java".
    public void specificWord() {
        String text = "I am learning Java programming";
        System.out.println(text.contains("Java"));
    }

    //Convert a string to a character array and print it.
    public void convertStringToArray() {
        String text = "JavaPractice";
        char[] array = text.toCharArray();
        for (char c : array) {
            System.out.println(c);
        }
    }
        //Print each character of a string using a loop.
        public void printEachCharacter(){
            String text = "LearningJava";
            for(int i=0;i<text.length();i++){
                char character = text.charAt(i);
                System.out.println(character);
            }
        }

        //Find first non-repeated character in a string.
        public void findFirstNonRepeatedCharacter(){
            String name ="suryakumari";
            for(int i=0;i<name.length();i++){
                char ch = name.charAt(i);
                int count = 0;
                for(int j=0;j<name.length();j++){
                    if(ch == name.charAt(j)){
                        count++;
                    }
                }
                if(count == 1) {
                    System.out.println("First non repeated character: " + ch);
                    break;
                }
            }
        }

    //Find first repeated character in a string
    public void findFirstRepeatedCharacter(){
        String name ="suryakumari";
        for(int i=0;i<name.length();i++){

        }
    }


    public static void main(String[] args) {
        SimpleStrings simpleStrings = new SimpleStrings();
        simpleStrings.findFirstNonRepeatedCharacter();

    }
}
