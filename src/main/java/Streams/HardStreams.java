package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HardStreams {

    String name = "SuryaKumari";
    String sentence = "Streams is easy and streams is powerful";


    //Find first non-repeated character in a string.
    public void findFirstNonRepeatedCharacter() {
      Character ch =  name.chars()
               .mapToObj(c-> (char)c)
               .filter(c->name.indexOf(c) == name.lastIndexOf(c))
              .findFirst()
              .orElse(null);
      System.out.println(ch);
    }

    //Find first repeated character in a string.
    public void findFirstRepeatedCharacter(){
        Character ch = name.chars()
                .mapToObj(c->(char) c)
                .filter(c-> name.indexOf(c) != name.lastIndexOf(c))
                .findFirst()
                .orElse(null);
        System.out.println(ch);
    }
    //Count word frequency from a sentence.
    public void countWordFrequency(){
      Map<String,Long> wordCount =  Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
      wordCount.forEach((word,count) ->
              System.out.println(word +  " : " + count));
    }

    //Find longest word in a sentence.
    public void findLongestWord(){
        String longestWord =
                Arrays.stream(sentence.split(" "))
                        .max((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                        .orElse("");

        System.out.println(longestWord);
    }
    //Convert a list into a map handling duplicate keys safely.

    public static void main(String[] args) {
        HardStreams hardStreams = new HardStreams();
        hardStreams.countWordFrequency();
    }
}
