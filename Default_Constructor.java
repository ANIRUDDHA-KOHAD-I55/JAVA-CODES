public class Default_Constructor{
    String firstN;
    String lastN;
    public Default_Constructor(){
        firstN="Aniruddha";
        lastN="Kohad";
    }
    public static void main(String[] args){
        Default_Constructor myStudent=new Default_Constructor();
        System.out.println(myStudent.firstN+" "+myStudent.lastN);
    }
}