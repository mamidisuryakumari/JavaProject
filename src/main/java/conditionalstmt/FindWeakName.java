package conditionalstmt;

public class FindWeakName {

    public void findWeakName(){
        String name = "sunday";
        switch(name){
            case "sunday":{
                System.out.println("This is a sunday");
                break;
            }

            case "monday":{
                System.out.println("This is a monday");
                break;
            }
            case "tuesday":{
                System.out.println("This is a tuesday");
                break;
            }
            default:
                System.out.println("There is no match");
        }
    }
public static void main(String[] args){
        FindWeakName fw = new FindWeakName();
        fw.findWeakName();
}


}
