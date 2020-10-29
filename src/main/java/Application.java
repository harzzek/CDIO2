import Controller.GameManager;
import gui_main.GUI;

public class Application {

    public static void main(String[] args)
    {
        GameManager gameManager = new GameManager();
        gameManager.round();
    }
}
