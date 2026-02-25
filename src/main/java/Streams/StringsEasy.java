package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsEasy {
    String name = "Suryakumari";

    //Count the number of characters in a string using streams.
    public void countNumberOfCharacters() {
        long nameCount = name.chars().count();
        System.out.println(nameCount);
    }

    //Convert all characters of a string to uppercase using streams.
    public void convertCharactersToUppercase(){
       String upperCase = name.chars()
               .mapToObj(ch->String.valueOf((char) ch).toUpperCase())
               .collect(Collectors.joining());
        System.out.println(upperCase);
    }
    //Print each character of a string on a new line using chars() stream.
    public void printEachCharacterOfString(){
         name.chars()
                 .mapToObj(ch-> (char)ch)
                 .forEach(System.out::println);
    }
    //Count the number of vowels in a given string using streams.
    public void countNumberOfVowels(){
       long vowelsCount =  name.chars()
                .mapToObj(ch->(char)ch)
                .filter(character -> character=='a' || character == 'e'||
                        character == 'i'|| character == 'o'|| character=='u' )
                .count();
        System.out.println("Vowel count is: " + vowelsCount);
    }


    public static void main(String[] args) {
        StringsEasy stringsEasy = new StringsEasy();
        System.out.println(stringsEasy.name.length());;
    }
}
