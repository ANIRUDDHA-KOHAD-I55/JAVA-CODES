import java.util.Scanner;
public class Overloading {
    public static int sum(int h, int b){
        return((1/2)*h*b);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int h,b;
        System.out.println("Enter the Height of Triangle>>>");
        h=s.nextInt();
        System.out.println("Enter the Breadth of Triangle>>>");
        b=s.nextInt();
        System.out.println(sum(h,b));
    }
}
