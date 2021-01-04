package main.java.com.codecool.zoo.animals;

public class Hexe extends Animals {
    public Hexe(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void feed(String food) {
        if( isDead() ){ return; }
        if(food.equals("hús"))weight--;
        if(food.equals("gyümölcs"))weight+=2;
        //food.equals("zöldséd")  ? weight--;
        checkAlive(5);
    }
}