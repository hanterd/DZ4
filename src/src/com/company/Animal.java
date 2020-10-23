package src.com.company;

public abstract class Animal implements ForAnimal {
    protected int hungry;
    protected String name;
    protected boolean predator;

    public abstract void eat(Meat meat) throws EatException;
    public abstract void eat(Grass grass) throws EatException;

    public int getHungry(){
        return hungry;
    }

    protected Animal(String name, int hungry){
        this.name = name;
        this.hungry = hungry;
    }

    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println(name + ": Я сыт! " + hungry);
        } else {
            System.out.println(name + "Я голоден на " + hungry);
        }
    }
}

