package lambdapractise;

public class Array {

    public static void main(String[] args){
        String[] names = {"Surya","Kumari","ravi"};

        for(int i=0; i<names.length; i++){
            System.out.println("Names is :" + names[i]);
        }
        for(String name:names){
            System.out.println("Names is :" + name);
        }

        String[] studentNames = new String[3];
        studentNames [0] = "Dileep";
        studentNames [1] = "Dhanya";
        studentNames [2] = "Bhavya";

        for(String sNames:studentNames){
            System.out.println(sNames);
        }

        String[] empNames = new String[5];
        empNames [0] = "SitaRamudu";
        empNames [1] = "Lakshmi";
        empNames [2] = "Srinu";
        empNames [3] = "Surya";
        empNames [4] = "Kitti";
        for(String eNames: empNames){
            System.out.println(eNames);
        }
    }
}








