final class A{
    int speed=100;
    String car="Benz";
    int inuse;
    final void gear(){
        System.out.println("Gear vehicle");
    }
}
// class B extends A{

// }
// You cannot extend the final class as you cannot modify anything in that

class B{

}

public class FinalExample {
    public static void main(String[] args) {
        A a=new A();
        // inuse=1;
        // you cannot modify anything in final class
        System.out.println("In use: "+a.inuse);
    }
    
}
