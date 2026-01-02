package lambdapractise;


public class LambdaEDemo {

    public static void main(String[] args){
        Runnable r = () ->
                System.out.println("Printing interface");

        r.run();
    }
}
