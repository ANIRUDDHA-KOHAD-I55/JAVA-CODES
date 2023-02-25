import java.util.Scanner;
class Derived {
    int chemMarks, physMarks;
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Chemistry Marks:");
        chemMarks = sc.nextInt();
        System.out.println("Enter Physics Marks:");
        physMarks = sc.nextInt();
    }
}
class Base extends Derived {
    public void displayResult() {
        int totalMarks = chemMarks + physMarks;
        System.out.println("Total Marks: " + totalMarks);
    }
}
public class JAVA_ISE_CODE_1 {
    public static void main(String[] args) {
        Base result = new Base();
        result.main();
        result.displayResult();
    }
}
