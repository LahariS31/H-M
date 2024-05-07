class Bank{
    
    void roi(){
        System.out.println("Normal intrest:10%");
    }
}
class SBI extends Bank{

}
class Axis extends Bank{

    
    void roi(){
        System.out.println("Axis Bank overridden intrest:12%");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        SBI s=new SBI();
        s.roi();
        Axis a=new Axis();
        a.roi();
    }
    
}
