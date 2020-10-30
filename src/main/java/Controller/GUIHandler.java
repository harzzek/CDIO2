package Controller;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class GUIHandler {
    private GUI gi;
    public GUIHandler(GUI gui){
    gi = gui;


    }
    public void guiGetString(String userString){
        gi.getUserString(userString);
    }
    public void guiAddPlayer(GUI_Player Player){


    }
    public void guiGetUserButtonPressed(String msg, String buttons){
    }
    public void setDice(int faceValue1, int faceValue2){

    }
    public void guiShowMessage(String msg){
    }
    public void close(){

    }
}

