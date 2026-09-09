package strings.easystrings;

public class CountUpperCaseAndLowerCase {

    public void countUpperCaseAndLowerCase(){
        String str = "Hello World";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCaseCount++;

            }else if(Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
        }
        System.out.println(upperCaseCount);
        System.out.println(lowerCaseCount);
    }

    public static void main(String[] args){
        CountUpperCaseAndLowerCase countUpperCaseAndLowerCase = new CountUpperCaseAndLowerCase();
        countUpperCaseAndLowerCase.countUpperCaseAndLowerCase();
    }
}
