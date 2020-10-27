package src.com.company;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aviary {
    String name;
    protected int spase;
    protected boolean isPredator;
    private int i = 0;
//    public ArrayList arrAnimal = new ArrayList(spase);
      private Map<String,Animal> animalMap= new HashMap<>();


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
                animalMap.put(animal.name, animal);
                System.out.print("В клетку добавлен " + animal.name);
//                System.out.println(". Он занимает " + arrAnimal.indexOf(animal) + " место");
                i++;
            } else {
                System.out.println(animal.name+ " не может жить в этой клетке");
            }
        }else {
            System.out.println(animal.name +", извини, мест нет");
        }
    }

    public Object getAnimal(String name ){
        System.out.println(animalMap.get(name));
        return animalMap.get(name);
    }

}



