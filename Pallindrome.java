import java.util.Scanner;
class Duplicate_1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String duplicate;
        String duplicate_1="";
        String duplicate_2="";
        System.out.println("Enter the String to check for Pallindrome==>");
        duplicate=s.next();
        System.out.println("The Entered String is : "+duplicate);
        System.out.println("Length of String is, "+duplicate.length());
        int l=duplicate.length();
        if(l%2==0){
            for(int i=0;i<l/2;i++){
                char ch=duplicate.charAt(i);
                //System.out.println(ch);
                duplicate_1+=ch;
                //System.out.print(duplicate_1+ch);
            }
            //System.out.println(duplicate_1);
            //System.out.println(l);

            for(int i=l-1;i+1>(l/2);i--){
                //System.out.println(i+" "+l);
                char ch=duplicate.charAt(i);
                //System.out.println(ch);
                duplicate_2+=ch;
            }
            //System.out.println(duplicate_2);
            //System.out.println(duplicate_1.compareTo(duplicate_2));
            if(duplicate_1.compareTo(duplicate_2)==0){
                System.out.println("String is Pallindrome");
            }
            else{
                System.out.println("String is NOT Pallindrome");
            }
        }
        else{
            for(int i=0;i<l/2;i++){
                char ch=duplicate.charAt(i);
                //System.out.println(ch);
                duplicate_1+=ch;
                //System.out.print(duplicate_1+ch);
            }
            //System.out.println(duplicate_1);
            //System.out.println(l);

            for(int i=l-1;i>(l/2);i--){
                //System.out.println(i+" "+l);
                char ch=duplicate.charAt(i);
                //System.out.println(ch);
                duplicate_2+=ch;
            }
            //System.out.println(duplicate_2);
            //System.out.println(duplicate_1.compareTo(duplicate_2));
            if(duplicate_1.compareTo(duplicate_2)==0){
                System.out.println("String is Pallindrome");
            }
            else{
                System.out.println("String is NOT Pallindrome");
            }
        }
    }
}
