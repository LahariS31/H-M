class P{
int money=20000;
String car="BMW";
private String newcar="Benz";
int site=5;
void use(){
    System.out.println("Money "+money);
    System.out.println("Car"+car);
    System.out.println("site"+site);
}
}

class C extends P{
    int money=10000;
    void use(){
System.out.println("child money:"+money);
System.out.println("parent money:"+super.money);
System.out.println("parent car:"+car);
// System.out.println("parent new car:"+newcar); child not able to use new car bcz its private

    }
}

public class SingleInheritance {

public static void main(String[] args) {
    C c=new C();
    c.use();
}
    
}
