package Model;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import java.awt.*;

public class Player {
    private String name;
    private int id;
    private int balance;
    private GUI_Car car;
    private GUI_Player player;

    //constructor
    public Player(int id, String name,GUI_Player player,GUI_Car car){
        this.name = name;
        this.id = id;
        this.balance = 1000;
        this.player = player;
        this.car = car;
    }

    //Method for updating players score
    public void updateScore(int balanceUpdate){
        balance += balanceUpdate;
    }

    public int getScore(){
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public GUI_Player getPlayer() {
        return player;
    }


}