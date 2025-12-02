package Constructors;
class Ram{              //private Constructor
    private Ram(){
        System.out.println("Private Constructor Called");
    }       //static method
    public static void displayMessage(){
        System.out.println("Hello,I am Ram!");
    }          //A private constructor cannot be accessed from outside the class.
}
public class PrivateConst {
    public static void main(String[] args) {
        Ram.displayMessage();
    }
}
