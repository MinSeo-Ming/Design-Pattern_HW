import java.util.Scanner;
import java.util.Random;

public class Fish extends Gameobject {
    Scanner in =new Scanner(System.in);
    Random rand =new Random();

    public Fish(int x,int y,int distance){
        super(x,y,distance);
    }
    @Override
    public void move(){
        temp_x =x;
        temp_y =y;

        switch (new Random().nextInt(4)){
        case'0':
                y=y-distance;
                break;
        case'1':
                y=y+distance;
                break;
        case'2':
                x=x+distance;
                break;
        case'3':
                x=x-distance;
                break;
        }
    }

    @Override
    public char getShape() {
        return 'F';
    }
}
