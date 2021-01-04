package main.java.com.codecool.zoo;

import main.java.com.codecool.zoo.animals.Bear;
import main.java.com.codecool.zoo.animals.Hexe;
import main.java.com.codecool.zoo.animals.Rabbit;
import main.java.com.codecool.zoo.animals.Wolf;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Feed feed = new Feed();
        createAnimals(feed);
        feed.feeding("hús");
        feed.feeding("zöldség");
        feed.feeding("hús");
        feed.feeding("gyümölcs");
        feed.feeding("hús");
        feed.printWhoIsAlive();
    }

    public static void createAnimals(Feed feed){
        Wolf wolf = new Wolf("Akela",3);
        feed.add(wolf);
        Bear bear1 = new Bear("Balu",4);
        feed.add(bear1);
        Rabbit rabbit = new Rabbit("Tapsi",2);
        feed.add(rabbit);
        Bear bear2 = new Bear("Brumi",6);
        feed.add(bear2);
        Hexe hexe = new Hexe("Durum",4);
        feed.add(hexe);
    }


}
