import java.util.Scanner;

public class Bear extends Gameobject {
    Scanner in =new Scanner(System.in);

    public Bear(int x,int y,int distance){
        super(x,y,distance);
    }
    @Override
    public void move(){
        temp_x =x;
        temp_y =y;

        String input =in.next();
        char input_w = input.charAt(0);

        switch (input_w){
        case'a':
                x=x-distance;
                break;
        case's':
                y=y+distance;
                break;
        case'd':
                y=y-distance;
                break;
        case'f':
                x=x+distance;
                break;
        }

    }


    @Override
    public char getShape() {
        return 'B';
    }
}
