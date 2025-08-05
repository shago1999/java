import GameLib.*;

public class main {
    public static void main(String[] args) {
        Indoor[] In = new Indoor[3];
        In[0] = new Indoor("amit");
        In[1] = new Indoor("amit01");
        In[2] = new Indoor("amit02");

        System.out.println("indoor players.....");
        for(int i=0; i < In.length; i++)
            In[i].display();
        System.out.println("indoor players.....");


        Outdoor[] Iin = new Outdoor[3];
        Iin[0] = new Outdoor("amit");
        Iin[1] = new Outdoor("amit001");
        Iin[2] = new Outdoor("amit002");

        System.out.println("Outdoor players.....");
        for(int i=0; i < Iin.length; i++)
            Iin[i].display();
        System.out.println("Outdoor players.....");
    }
}
