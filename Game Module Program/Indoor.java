package Game;

public class Indoor
{
    String player;

    public Indoor(String p)
    {
        player = p;
    }
    public void display()
    {
        System.out.println(player);
    }
    protected void finalize()
    {
        System.out.println("Terminating Indoor....");
    }
}