import java.util.Scanner;
public class Room {
    float length;
    float breadth;
    float height;
    void gedata(float a, float b, float c){
        length=a;
        breadth=b;
        height=c;
    }
}
class RoomVolume{
    public static void main(String[] args){
        float volume;
        Room room1=new Room();
        Scanner s=new Scanner(System.in);
        room1.gedata(14,10,12);
        volume=room1.length*room1.breadth*room1.height;
        System.out.println("Volume>>>"+volume);
    }
}