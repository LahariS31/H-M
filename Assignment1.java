import java.util.Scanner;

abstract class Emp {
    int age, id;
    String name;
    float Salary;

    String desg;

    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter Id");
        id = sc.nextInt();
        System.out.println("Enter age");
        age = sc.nextInt();

    }

    abstract void raise();

    void display() {
        System.out.println("------------------");
        System.out.println("My Id:" + id + "My Name:" + name + "\n" + "My Age:" + age + "\n" + "My Salary:" + Salary
                + "\n" + "My Desgination:" + desg);
        System.out.println("------------------");

    }
}

class Clerk extends Emp {

    Clerk() {
        desg = "Clerk";
        Salary = 40000;
    }
    void raise() {
        Salary = (float) (1.1 * Salary);
        System.out.println("------------------");
        System.out.println("My Id:" + id + "My Name:" + name + "\n" + "My Age:" + age + "\n"
                + "\n" + "My Desgination:" + desg);
        System.out.println("Updated Salary:" + (Salary));
    }

}

class Manager extends Emp {

    Manager() {
        desg = "Manager";
        Salary = 100000;
    }
    void raise() {
        Salary = (float) (1.1 * Salary);
        System.out.println("------------------");
        System.out.println("My Id:" + id + "My Name:" + name + "\n" + "My Age:" + age + "\n"
                + "\n" + "My Desgination:" + desg);
        System.out.println("Updated Salary:" + (Salary));
    }

}

class Tester extends Emp {

    Tester() {
        desg = "Tester";
        Salary = 50000;
    }
    void raise() {
        Salary = (float) (1.1 * Salary);
        System.out.println("------------------");
        System.out.println("My Id:" + id + "My Name:" + name + "\n" + "My Age:" + age + "\n"
                + "\n" + "My Desgination:" + desg);
        System.out.println("Updated Salary:" + (Salary));
    }

}

class Dev extends Emp {

    Dev() {
        desg = "Developer";
        Salary = 50000;
    }
    void raise() {
        Salary = (float) (1.1 * Salary);
        System.out.println("------------------");
        System.out.println("My Id:" + id + "My Name:" + name + "\n" + "My Age:" + age + "\n"
                + "\n" + "My Desgination:" + desg);
        System.out.println("Updated Salary:" + (Salary));
    }

}

public class Assignment1 {

    public static void main(String[] args) {
        int choice, ch1 = 0;
        Tester t = null;
        Manager m = null;
        Dev d = null;
        Clerk c = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("select \n1)Create\n2)Display\n3)raise\n4)Exit");
            ch1 = sc.nextInt();
            if (ch1 == 1) {
                do {
                    System.out.println("Create Profile \n1)dev\n2)clerk\n3)Manager\n4)Tester\n5)exit");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        d = new Dev();

                    } else if (choice == 2) {
                        c = new Clerk();

                    } else if (choice == 3) {
                        m = new Manager();

                    } else if (choice == 4) {
                        t = new Tester();

                    }

                    else if (choice == 5) {

                    } else {
                        System.out.println("Invalid input");
                    }

                } while (choice != 5);

            }
            if (ch1 == 2) {
                do {
                    System.out.println("enter \n1)dev\n2)clerk\n3)Manager\n4)Tester\n5)exit");
                    choice = sc.nextInt();
                    if (choice == 1) {

                        d.display();
                    } else if (choice == 2) {

                        c.display();
                    } else if (choice == 3) {

                        m.display();
                    } else if (choice == 4) {

                        t.display();
                    }

                    else if (choice == 5) {

                    } else {
                        System.out.println("Invalid input");
                    }

                } while (choice != 5);
            }
            if (ch1 == 3) {

                System.out.println("enter \n1)dev\n2)clerk\n3)Manager\n4)Tester\n5)exit");
                choice = sc.nextInt();
                if (choice == 1) {

                    d.raise();
                } else if (choice == 2) {

                    c.raise();
                } else if (choice == 3) {

                    m.raise();
                } else if (choice == 4) {

                    t.raise();
                }

                else if (choice == 5) {

                } else {
                    System.out.println("Invalid input");
                }

            }

        } while (ch1 != 4);
        sc.close();

    }
}
