package src.com.company;

public abstract class Herbivores extends Animal {
    {
        predator = false;
    }


    public Herbivores(String name, int hungry, SizeAviary size) {
        super(name, hungry, size);
    }

    @Override
    public void eat(Meat meat) throws WorngFoodException {

        throw new WorngFoodException("Травоядный не будет это есть");
    }

    @Override
    public void eat(Grass grass) {
        if (hungry<0) {
            hungry += grass.value;
            grass.value = 0;
            System.out.println(name + " съел траву. Он голоден на" + hungry);
        }
    }

}
