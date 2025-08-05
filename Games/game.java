package Games;

public class game
{
    public static void main(String[] args) {

        Indoor In[] = new Indoor[3];
        In[0] = new Indoor("amit");
        In[1] = new Indoor("amit01");
        In[2] = new Indoor("amit02");
        System.out.println("indoor players.....");
        for(int i=0;i<In.length;i++)
        In[i].display();
        System.out.println("indoor players.....");

        }

}
