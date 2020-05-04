public abstract class Gameobject {
    protected int distance;
    protected  int x,y;
    protected  int temp_x, temp_y;

    public Gameobject(int startX,int startY, int distance){
        this.x=startX;
        this.y=startY;
        this.distance=distance;
    }
    public int getX(){return x;}
    public int getY(){return y;}

    public boolean collide(Gameobject p){
        if(this.x==p.getX()&&this.y==p.getY())
            return true;
        else
            return false;
    }
    public abstract void move();
    public abstract char getShape();
}

