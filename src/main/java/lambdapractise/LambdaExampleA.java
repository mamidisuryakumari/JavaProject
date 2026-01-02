package lambdapractise;

@FunctionalInterface
interface Add{
    int addNumbers(int a, int b);
}
public class LambdaExampleA {

    public static void main(String[] args){

        Add ad = (a,b) -> a+b;
        System.out.println(ad.addNumbers(10,20));
    }
}
