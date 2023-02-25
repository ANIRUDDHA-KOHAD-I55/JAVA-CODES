

import java.io.*;
class Operator_OverL
{
    void findarea(int a, int b, int c)
    {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "\n Area of triangle with lenght of sides  "+a+"," +b+ " and " +c+" is : "+ triarea);
        //Heron's formula is used here
    }
    void findarea(int a)
    {
        System.out.println( "\n Area of circle with  radius " +a+ " is :" + 3.14 * a*a);
    }


    public static void main(String p[]) throws IOException {
        while(true) {
            Operator_OverL d = new Operator_OverL();
            BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\n Find area of \n 1 . Triangle \n 2 . Circle \n 3 . EXIT  \n\nSelect a choice : ");
            int choice = Integer.parseInt(Br.readLine());
            switch (choice) {
                case 1:
                    System.out.print("\n Enter the length of first side : ");
                    int x = Integer.parseInt(Br.readLine());
                    System.out.print("\n Enter the length of second side : ");
                    int y = Integer.parseInt(Br.readLine());
                    System.out.print("\n Enter the length of third side : ");
                    int z = Integer.parseInt(Br.readLine());
                    d.findarea(x, y, z);
                    break;
                case 2:
                    System.out.print("\n Enter the radius : ");
                    int r = Integer.parseInt(Br.readLine());
                    d.findarea(r);
                    break;
                case 3:
                    System.out.println("Code is executed successfully.");
                    System.exit(1);

                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
