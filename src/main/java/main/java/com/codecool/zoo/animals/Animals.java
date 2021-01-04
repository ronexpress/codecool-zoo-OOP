package main.java.com.codecool.zoo.animals;

public abstract class Animals {
    protected final String name;
    protected int weight;
    protected boolean isDead=false;

    public Animals(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public boolean isDead(){
        return isDead;
    }

    public void feed(String food){
    }

    public void checkAlive(int maxWeight){
        isDead = (weight <= 0 || weight > maxWeight);
    }

}
