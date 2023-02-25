import java.util.Scanner;

class No_args {
    String name;
    public No_args() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the Name of Student : ");
        String name= scan.nextLine();
        System.out.println("My name is : "+ name);
    }
}
class main {
    public static void main(String[] args) {
        String name;
        No_args obj = new No_args();
    }
}