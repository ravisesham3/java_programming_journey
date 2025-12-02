class Student{
    String name;
    int age;
    void display(){
        System.out.println("Student Name:"+name);
        System.out.println("Student Age:"+age);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Ravi sesham";
        s.age=21;
        s.display();
    }
}
