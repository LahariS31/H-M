import java.util.Scanner;

class Emp {
    int age, id;
    String name;
    String desg;
    int Salary;

    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter Id");
        id = sc.nextInt();
        System.out.println("Enter age");
        age = sc.nextInt();

    }

    void display() {
        System.out.println("------------------");

        System.out.println(
                "My Id:" + id + "\n" + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                        + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

class Clerk extends Emp {

    Clerk() {
        desg = "Clerk";
        Salary = 40000;

    }

}

class Manager extends Emp {

    Manager() {
        desg = "Manager";
        Salary = 100000;
    }

}

class Tester extends Emp {

    Tester() {
        desg = "Tester";
        Salary = 50000;

    }

    void display() {
        System.out.println("------------------");
        System.out.println(
                "My Id:" + id + "\n" + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                        + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

class Dev extends Emp {

    Dev() {
        desg = "Developer";
        Salary = 50000;

    }

}

public class MethodOverRiding {

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("enter \n1)dev\n2)clerk\n3)Manager\n4)Tester\n5)exit");
            choice = sc.nextInt();
            if (choice == 1) {
                Dev d = new Dev();
                d.display();
            } else if (choice == 2) {
                Clerk c = new Clerk();
                c.display();
            } else if (choice == 3) {
                Manager m = new Manager();
                m.display();
            } else if (choice == 4) {
                Tester t = new Tester();
                t.display();
            }

            else if (choice == 5) {
                System.exit(0);

            } else {
                System.out.println("Invalid input");
            }

        } while (choice != 5);
        sc.close();

    }
}
