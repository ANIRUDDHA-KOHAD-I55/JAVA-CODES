public class S_Recursion_4 {
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
    public static void main(String[] args){
        System.out.println("FACTORIAL OF 5 is : "+factorial(5));
    }
}
