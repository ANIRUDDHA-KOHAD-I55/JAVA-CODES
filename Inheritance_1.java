import java.util.Scanner;
public class Inheritance_1 {
    public static void main(String[] args) {
        Programmer childObj1=new Programmer();
        Manager childObj2=new Manager();
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        System.out.println("Result " + a);
    }
}
class Employee{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        String address;
        int phoneNumber;
        int experience;
        name = s.nextLine();
        System.out.println("Name of Employee");
        address=s.nextLine();
        System.out.println("Address of Employee.");
        phoneNumber=s.nextInt();
        System.out.println("Contact Number of Employee.");
        experience=s.nextInt();
        System.out.println("Experience of Employee.");
    }
}
class Programmer extends Employee{
    Scanner s = new Scanner(System.in);
    String programmingLanguages;


}
class Manager extends Employee{
    Scanner s = new Scanner(System.in);
    String teamSize;
}
