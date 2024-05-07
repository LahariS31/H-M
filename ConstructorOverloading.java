class Draw{
    // Constructor Overloading
    // The constructor overloading can be defined as the concept of having more than one 
    // constructor with different parameters so that every constructor can perform a different task.
    Draw(){
        System.out.println("no area");
    }
    Draw(double d){
        System.out.println("Circle:"+(2*3.142*d));
    }
    Draw(float a,float b){
        System.out.println("Rectangle:"+(a*b));
    }
    Draw(int a){
        System.out.println("square"+(a*a));
    }


}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Draw c=new Draw(1.5);
        Draw r=new Draw(1,2);
        Draw s=new Draw(4);
        Draw noshape=new Draw();
        
    }
    
}
