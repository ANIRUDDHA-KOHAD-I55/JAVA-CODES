import java.util.Scanner;
public class Mathematical_Operations {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println(" ");
            System.out.println("Enter two numbers to perform operations : ");
            System.out.println("Enter the first number : ");
            int x=s.nextInt();
            System.out.println("Enter the second number : ");
            int y=s.nextInt();
            System.out.println("Choose the operation you want to perform : ");
            System.out.println("Choose 0 for Exit.");
            System.out.println("Choose 1 for Addition.");
            System.out.println("Choose 2 for Subtraction.");
            System.out.println("Choose 3 for Multiplication.");
            System.out.println("Choose 4 for Division.");
            int n=s.nextInt();
            switch(n){
                case 0:
                    System.exit(0);
                case 1:
                    int add;
                    add=x+y;
                    System.out.println("Result :"+add);
                    break;
                case 2:
                    int sub;
                    sub=x-y;
                    System.out.println("Result :"+sub);
                    break;
                case 3:
                    int mul;
                    mul=x*y;
                    System.out.println("Result :"+mul);
                    break;
                case 4:
                    int div;
                    div=x/y;
                    System.out.println("Result :"+div);
                    break;
            }
        }
    }
}
