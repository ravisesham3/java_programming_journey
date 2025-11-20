class Student {
    int rollNo;
    String name;
    int age;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = 101;
        s.name = "Ravi";
        s.age = 20;

        s.display();
    }
}
