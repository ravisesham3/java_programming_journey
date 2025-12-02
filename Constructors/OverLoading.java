package Constructors;
class Ravi{             //One Parameter
    Ravi(String name){
        System.out.println("Constructor with one"+"argument-string:"+name);
    }
    Ravi(String name,int age){  //Two parameters
        System.out.println("Constructor with two argumnets:"+"String and Integer:"+name+""+age);
    }       //In method overloading is to create multiple constructors in the same class
}
public class OverLoading {
    public static void main(String[] args) {
        Ravi R1=new Ravi("Sesham");
        Ravi R2=new Ravi("Ram",22);
    }
}
