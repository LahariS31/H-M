import java.util.Scanner;

class Emp {
    int age, id;
    String name;

    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter Id");
        id = sc.nextInt();
        System.out.println("Enter age");
        age = sc.nextInt();

    }
}

class Clerk extends Emp {

    String desg = "Clerk";
    float Salary = 40000;
    int age;

    Clerk() {

    }

    void display() {
        System.out.println("------------------");
        System.out.println("My Id:" + id + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

class Manager extends Emp {

    String desg = "Manager";
    float Salary = 100000;
    int age;

    Manager() {

    }

    void display() {
        System.out.println("------------------");
        System.out.println(
                "My Id:" + id + "\n" + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                        + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

class Tester extends Emp {

    String desg = "Tester";
    float Salary = 50000;
    int age;

    Tester() {

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

    String desg = "Developer";
    float Salary = 50000;
    int age;

    Dev() {

    }

    void display() {
        System.out.println("------------------");
        System.out.println(
                "My Id:" + id + "\n" + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                        + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

public class Inheritence {

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
