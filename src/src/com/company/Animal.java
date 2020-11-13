package src.com.company;

import java.util.Objects;

public abstract class Animal implements ForAnimal {
    protected int hungry;
    protected String name;
    protected boolean predator;
    private SizeAviary size;

    public SizeAviary getSize() {
        return size;
    }

    public abstract void eat(Meat meat) throws WorngFoodException;
    public abstract void eat(Grass grass) throws WorngFoodException;

    @Override
    public String toString() {
        return "Animal{" +
                "hungry=" + hungry +
                ", name='" + name + '\'' +
                ", predator=" + predator +
                '}';
    }

    public int getHungry(){
        return hungry;
    }

    protected Animal(String name, int hungry, SizeAviary size){
        this.name = name;
        this.hungry = hungry;
        this.size = size;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return hungry == animal.hungry &&
                predator == animal.predator &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hungry, name, predator);
    }

    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println(name + ": Я сыт! " + hungry);
        } else {
            System.out.println(name + "Я голоден на " + hungry);
        }
    }
}

