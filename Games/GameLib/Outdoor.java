package GameLib;

public class Outdoor {
    String player;

    public Outdoor(String p) {
        player = p;
    }

    public void display() {
        System.out.println(player);

    }

    protected void finalize() {
        System.out.println("Terminating Outdoor....");
    }
}
