import Controller.GameManager;

public class Application {

    public static void main(String[] args)
    {
        try {
            GameManager gameManager = new GameManager();
        } catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
