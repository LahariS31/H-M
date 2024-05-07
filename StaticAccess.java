class A{
    static int x=100;
    static void display(){
        System.out.println("This is static method accessed w/o object creation");
    }
}
public class StaticAccess {
    public static void main(String[] args) {
        A.display();
        System.out.println("This static variable accessed by class name: "+A.x);
    }
    
}
