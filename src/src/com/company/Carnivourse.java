package src.com.company;

public abstract class Carnivourse extends Animal {
    {
        predator = true;
    }

    public Carnivourse(String name, int hungry,SizeAviary size) {

        super(name, hungry,size);
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
    public void eat(Grass grass) throws WorngFoodException {

        throw new WorngFoodException("Хищник не будет это есть");
    }


}