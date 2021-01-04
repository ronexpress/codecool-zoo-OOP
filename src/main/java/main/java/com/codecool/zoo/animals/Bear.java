package main.java.com.codecool.zoo.animals;

public class Bear extends Animals {
    public Bear(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void feed(String food) {
        if( isDead() ){ return; }
        if(food.equals("hús"))weight++;
        if(food.equals("gyümölcs"))weight++;
        if(food.equals("zöldséd"))weight--;
        checkAlive(10);
    }
}
