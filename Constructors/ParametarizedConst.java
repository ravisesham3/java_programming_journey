package Constructors;

public class ParametarizedConst {
    String name;        //initialize parameter values
    int age;
    ParametarizedConst(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("PersonName:"+name+"PersonAge:"+age);
    }
    public static void main(String[] args) {
        ParametarizedConst P=new ParametarizedConst("Ravisesham",21);
        P.display();
    }
}
