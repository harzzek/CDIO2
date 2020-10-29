package Model;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

public class Player {
    private String name;
    private int id;
    private int balance;
    private GUI_Car car;
    private GUI_Player player;
    private int placement = 0;

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
        if(balance+balanceUpdate < 0)
        {
            balance=0;
        }else {
            balance += balanceUpdate;
        }
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
    public void updatePlacement(int newPlacement)
    {
        int rest;
        if(placement+newPlacement >= 12)
        {
            rest = placement+newPlacement - 12;
            placement = rest;
        }else {
            placement += newPlacement;
        }
    }


    public int getPlacement() {
        return placement;
    }


}