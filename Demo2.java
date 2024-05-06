import java.util.Scanner;

class Clerk {
    int id;
    String name;
    String desg = "Clerk";
    float Salary = 40000;
    int age;

    Clerk() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter Id");
        id = sc.nextInt();

        // System.out.println("Enter Salary");
        // Salary = sc.nextFloat();

        System.out.println("Enter age");
        age = sc.nextInt();

        // System.out.println("Enter Desgination");
        // desg = sc.next();

        // sc.close();

    }

    void display() {
        System.out.println("------------------");
        System.out.println("My Id:" + id + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

class Dev {
    int id;
    String name;
    String desg = "Developer";
    float Salary = 50000;
    int age;

    Dev() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter Id");
        id = sc.nextInt();

        // System.out.println("Enter Salary");
        // Salary = sc.nextFloat();

        System.out.println("Enter age");
        age = sc.nextInt();

        // System.out.println("Enter Desgination");
        // desg = sc.next();

        // sc.close();

    }

    void display() {
        System.out.println("------------------");
        System.out.println(
                "My Id:" + id + "\n" + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                        + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

public class Demo2 {

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("enter \n1)dev\n2)clerk\n3)exit");
            choice = sc.nextInt();
            if (choice == 1) {
                Dev d = new Dev();
                d.display();
            } else if (choice == 2) {
                Clerk c = new Clerk();
                c.display();
            } else if (choice == 3) {
                System.exit(0);

            } else {
                System.out.println("Invalid input");
            }

        } while (choice != 3);
        sc.close();

    }
}
