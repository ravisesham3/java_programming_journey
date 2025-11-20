public class ExampleConstructor {
    int modelyear;              //You can add many parameters as you want
    String modelname;
public ExampleConstructor(int year,String name){
    modelyear=year;
    modelname=name;
}
public static void main(String[] args) {
    ExampleConstructor mycar=new ExampleConstructor(1992, "Safari");
    System.out.println(mycar.modelyear +" " +mycar.modelname);
}
}
