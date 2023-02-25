import java.util.Scanner;
public class BASE extends DERIVED{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Physics Marks :");
        int phy,chem;
        phy=s.nextInt();
        System.out.println("Enter the Chemistry Marks : ");
        chem=s.nextInt();
    }
}
public class DERIVED{
    public static void main(String[] args){
        int sum;
        sum=phy+chem;
        System.out.println("The Sum of Physics and Chemistry is"+sum);
    }
}