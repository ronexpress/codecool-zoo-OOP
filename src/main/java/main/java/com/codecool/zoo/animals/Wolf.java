package main.java.com.codecool.zoo.animals;

public class Wolf extends Animals {
    public Wolf(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void feed(String food) {
        if( isDead() ){ return; }
        if(food.equals("hús"))weight+=3;
        if(food.equals("gyümölcs"))weight--;
        if(food.equals("zöldséd"))weight--;
        checkAlive(6);
    }
}
