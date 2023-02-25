public class A_38 {
    // main method
    public static void main(String argvs[])
    {

        String str = "For learning Java, JavaTpoint is a very good site.";
        int size = str.length();

        System.out.println(str);
        String target = null;

// replacing null with JavaTpoint. Hence, the NullPointerException is raised.
        str = str.replace(target, "JavaTpoint ");

        System.out.println(str);

    }
}
