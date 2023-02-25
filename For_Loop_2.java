import java.util.Scanner;
public class For_Loop_2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a;
        String Name1[];
        System.out.print("Enter the number of Student in your class : ");
        a=s.nextInt();
        for(int i=0;i<a;i++){
            Scanner q=new Scanner(System.in);
            System.out.println("Enter the name of student, "+(i+1));
            String Name=q.nextLine();

            System.out.println("Name of Student is, "+Name);
        }
        System.out.print("Process has finished...");
    }
}
