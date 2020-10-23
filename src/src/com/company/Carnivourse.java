package src.com.company;

public abstract class Carnivourse extends Animal {
    {
        predator = true;
    }

    public Carnivourse(String name, int hungry) {

        super(name, hungry);
    }

    @Override
    public void eat(Meat meat) {
        if (hungry<0) {
            hungry += meat.value;
            meat.value = 0;
            System.out.println(name + " съел траву. Он голоден на" + hungry);
        }
    }

    @Override
    public void eat(Grass grass) throws EatException {

        throw new EatException("Хищник не будет это есть");
    }


}