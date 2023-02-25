public class For_Loop_3 {
        public static void main(String[] args){
            System.out.println("Screen Display");
            for(int i=1;i<=8;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                    System.out.print("0 \t");
                }
                System.out.print("\n");
            }
            for(int i=9;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                    System.out.print("1 \t");
                }
                System.out.print("\n");
            }
            System.out.println("Screen Displaying Done");
        }
}
