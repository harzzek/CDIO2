package Model;

public class Player {
    String name;
    int id;
    int balance;

    //constructor
    public Player(int id, String name){
        this.name = name;
        this.id = id;
        this.balance = 1000;
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
}