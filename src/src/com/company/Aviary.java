package src.com.company;

import java.util.ArrayList;

public class Aviary {
    String name;
    protected int spase;
    protected boolean isPredator;
    private int i = 0;
    public ArrayList arrAnimal = new ArrayList(spase);
    public Aviary(String name, int spase, boolean isPredator) {
        if (spase > 1) { //Проверка корректности ввода
            this.name = name;
            this.spase = spase;
            this.isPredator = isPredator;
            System.out.print("Создана клетка "+name+" размером " + spase);

            if (isPredator) {
                System.out.println(" для хищников");
            } else {
                System.out.println(" для травоядных");
            }
        } else {
            System.out.println("Таких клеток не бывает");
        }
    }


    public void addAnimal(Animal animal){
        if (i<spase) {
            if (isPredator == animal.predator) {
                arrAnimal.add(animal);
                System.out.print("В клетку добавлен " + animal.name);
                System.out.println(". Он занимает " + arrAnimal.indexOf(animal) + " место");
                i++;
            } else {
                System.out.println(animal.name+ " не может жить в этой клетке");
            }
        }else {
            System.out.println(animal.name +", извини, мест нет");
        }
    }

    public Object getAnimal(int index ){
        System.out.println(arrAnimal.get(index));
        return arrAnimal.get(index);
    }

}



