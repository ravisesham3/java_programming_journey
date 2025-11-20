public class ParameterDemo {
    int x;
public ParameterDemo(int y){
    x=y;                        //Constuctors can alsp take parameters,Which is used to initialize attributes
}
public static void main(String[] args) {
    ParameterDemo myDemo=new ParameterDemo(21);
    System.out.println(myDemo.x);
}
}
