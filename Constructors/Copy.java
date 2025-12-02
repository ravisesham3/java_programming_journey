package Constructors;
class CopyConst{
    //Data members of the class
    String name;
    int age;
    //Parametarized constructor
    CopyConst(String name,int age){
        this.name=name;
        this.age=age;
    }
    //Copy constructor
    CopyConst(CopyConst obj2){
        this.name=obj2.name;
        this.age=obj2.age;
    }
}
public class Copy {
    public static void main(String[] args) {
        System.out.println("First Object");
        CopyConst c1=new CopyConst("Ram",22);       //Initialize First object class
        System.out.println("PersonName:"+c1.name+"PersonAge:"+c1.age);
        System.out.println();

        CopyConst c2=new CopyConst(c1);             //Copy of first object class
        System.out.println("Copy Constructor used second object");
        System.out.println("PersonName:"+c2.name+"PersonAge:"+c2.age);
    }
}
