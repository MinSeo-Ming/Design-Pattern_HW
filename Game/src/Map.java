import java.util.Arrays;

public class Map {
    char[][] map;
    public Map(){
        map =new char[10][20];
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++)
                map[i][j]='-';
        }
    }

    public void set_location(Gameobject obj){
        map[obj.x][obj.y]=obj.getShape();
    }

    public void moved_location(Gameobject obj){
        try{
            map[obj.x][obj.y] =obj.getShape();
            map[obj.temp_x][obj.temp_y]='-';
        }
        catch (Exception e){
            obj.y=obj.temp_y;
            obj.x=obj.temp_x;
        }
    }

    public void show_Array(){
        for(int i=0; i<map.length; i++){
            for(int j =0; j<map[i].length; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
