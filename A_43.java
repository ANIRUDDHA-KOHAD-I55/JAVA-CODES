import java.util.*;
import java.util.stream.Collectors;
public class A_43 {
    /* Driver Code */
    public static void main(String args[])
    {
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array
        String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
        System.out.println(str.toString());  //Displays result
    }
}
