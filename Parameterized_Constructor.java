public class Parameterized_Constructor {
    String studentName;
    int studentAge;//constructor
    Parameterized_Constructor(String name, int age){
        studentName = name;
        studentAge = age;
    }
    void display(){
        System.out.println(studentName+ " "+studentAge);
    }
    public static void main(String[] args){
        Parameterized_Constructor myObj = new Parameterized_Constructor("Aniruddha" , 20);
        myObj.display();
    }
}
