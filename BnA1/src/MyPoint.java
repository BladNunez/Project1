
public class MyPoint {
    
    private int x,y;

    MyPoint()
    {
        this(0,0);

    }
    MyPoint(int x, int y)
    {
        this.x =x;
        this.y = y;

    }
    public void set(int x, int y)
    {
        this.x = x;
        this.y = y;

    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    @Override
    public String toString()
    {
        return "Points: "+ x + "," + y;
    }

}
