package Controller;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class GUIHandler {

    private GUI gui;


    public GUIHandler(GUI gui)
    {
        this.gui = gui;

    }
    public void guiGetString(String userString){
        gui.getUserString(userString);
    }

    public void guiAddPlayer(GUI_Player Player){
        gui.addPlayer(Player);
    }

    public void guiGetUserButtonPressed(String msg, String buttons){
        gui.getUserButtonPressed(msg, buttons);

    }
    public void setDice(int faceValue1, int faceValue2){
        gui.setDice(faceValue1, faceValue2);

    }
    public void guiShowMessage(String msg){
        gui.showMessage(msg);
    }

    public void close(){
        gui.close();
        System.exit(1);
    }

    public GUI getGui() {
        return gui;
    }


}

