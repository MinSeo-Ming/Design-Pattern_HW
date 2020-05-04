import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String argsp[]){
        Scanner in= new Scanner(System.in);
        Random rand =new Random();

        //int []alloc=new int[4];
        //make(alloc);

        //Bear bear =new Bear(alloc[0],alloc[2],1);
        //Fish fish =new Fish(alloc[1],alloc[3],1);
        Bear bear =new Bear(0,2,1);
        Fish fish =new Fish(6,13,1);

        Map map =new Map();
        map.set_location(bear);
        map.set_location(fish);

        while(true){
            map.show_Array();
            System.out.print("왼쪽으로 (a),위로 (s), 아래로 (d), 오른쪽으로 (f) >> ");
            bear.move();
            map.moved_location(bear);

            if(bear.collide(fish)){
                map.show_Array();
                System.out.println("곰이 이겼습니다!");
                break;
            }
            else{
                int check =(int)(Math.random()*4);
                if(check<2){
                    fish.move();
                    map.moved_location(fish);
                    if(fish.collide(bear)){
                        fish.move();
                        map.moved_location(fish);
                    }
                }
            }
        }
    }
   /* public static void make(int[] alloc){
        Random rand =new Random();
        int []temp=new int[4];
        while(true) {
            temp[0]= (int) rand.nextInt(10);// bear x
            temp[1] = (int) rand.nextInt(20);
            temp[2]= (int) rand.nextInt(10);//fish
            temp[3]= (int) rand.nextInt(20);

            if (temp[0] != temp[2] || temp[1] != temp[3])
                break;
        }
        for(int i=0; i<alloc.length; i++)
            alloc[i]=temp[i];
    }*/
}
