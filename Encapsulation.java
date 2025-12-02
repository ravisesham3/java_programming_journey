class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        
        StudentMain s = new StudentMain();
        s.setName("Ravi sesham");
        s.setAge(21);

        System.out.println("Student name:"+s.getName());
        System.out.println("Student age:"+s.getAge());
    }
}
