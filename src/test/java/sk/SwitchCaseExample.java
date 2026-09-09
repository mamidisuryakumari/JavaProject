package sk;

public class SwitchCaseExample {
    public void switchCaseExample(){
        String browser = "Chrome1";
        switch (browser){
            case "Chrome" :
                System.out.println("Chrome is opened");
                break;
            case "Edge":
                System.out.println("Edge is opened");
                break;
            default:
                System.out.println("Invalid browser name");
        }
    }
    public static void main(String[] args){
        SwitchCaseExample switchCaseExample = new SwitchCaseExample();
        switchCaseExample.switchCaseExample();
    }
}
