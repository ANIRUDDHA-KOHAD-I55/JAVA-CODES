import java.util.Scanner;
public class Binary_Search_Java {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        System.out.println("The elements of Array are : ");
        for(int i=0;i<=5;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        Scanner s=new Scanner(System.in);
        int q;
        System.out.println("Enter the number to be searched...");
        q=s.nextInt();
        int u,k;
        for(int i=0;i<=5;i++){
            u=arr[i];
            k=i;
            if(arr[i]==q) {
                System.out.println("---Element found---");
                System.out.println("Element " + u + " is found at position, " + k);
                break;
            }
            else {
                System.out.println("Element is not found!!!, (position : " + k+")");
            }
        }


    }
}
