package opp;

public class OverLoadingExample {

    public void add(int a,int b){
        System.out.println(a+b);
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args){
        OverLoadingExample ole = new OverLoadingExample();
        ole.add(2,3);
        System.out.println(
        ole.add(2,3,5));

    }
}
