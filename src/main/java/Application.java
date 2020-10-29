import Controller.GameManager;
import gui_main.GUI;

public class Application {

    public static void main(String[] args)
    {
        GUI gui = new GUI();
        GameManager gameManager = new GameManager(gui);
        gameManager.round();
    }
}
