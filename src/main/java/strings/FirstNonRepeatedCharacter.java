package strings;

public class FirstNonRepeatedCharacter {

    public void firstNonRepeatedCharacter() {
        String str = "swiss";

        for(int i = 0; i < str.length(); i++){

            boolean isUnique = true;

            for(int j = 0; j < str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                System.out.println("First non-repeated character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeated character found");
    }

    public  void main(String[] args){
        FirstNonRepeatedCharacter firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();
        firstNonRepeatedCharacter.firstNonRepeatedCharacter();
    }
}
