public class Constructor {
    int x;
                                    //Constructor name must match with the class name
    public Constructor(){               
        x=100;                      //If the constuctor is called when object is created
    }
public static void main(String[] args) {
    Constructor c=new Constructor();
    System.out.println(c.x);
}
}

