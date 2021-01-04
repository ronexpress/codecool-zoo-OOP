package main.java.com.codecool.zoo;

import main.java.com.codecool.zoo.animals.Animals;

import java.util.LinkedList;
import java.util.List;

public class Feed {

    List<Animals> animals = new LinkedList<Animals>();

    public Feed(){
    }

    public void add(Animals animal){
        animals.add(animal);
    }

    public void feeding(String food){
        System.out.println(food);
        for(Animals animal : animals){
            animal.feed(food);
        }
    }

    public void printWhoIsAlive(){
        for(Animals animal : animals){
            System.out.println(animal.getName()+" : "+ (animal.isDead()?"Dead :(":animal.getWeight()+"kg") );
        }
        System.out.println();
    }

}
