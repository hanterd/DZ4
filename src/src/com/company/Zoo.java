package src.com.company;

public class Zoo  {

    public static void feedAnimal (Animal animal, int portion) throws EatException {
        System.out.println(animal.name+" будет есть "+portion+" порциий");
        Banana[] bananas = new Banana[portion];
        Egg[] eggs = new Egg[portion];
        Ovis[] ovis = new Ovis[portion];
        Nuts[] nuts = new Nuts[portion];
        for (int i=0; i<bananas.length; i++){
            bananas[i] = new Banana();
            eggs[i] = new Egg();
            ovis[i] = new Ovis();
            nuts[i] = new Nuts();
            animal.eat(bananas[i]);// Если кормить не тем, то выдаст ошибку
            animal.eat(eggs[i]);// Если кормить не тем, то выдаст ошибку
            animal.eat(ovis[i]);// Если кормить не тем, то выдаст ошибку
            animal.eat(nuts[i]);// Если кормить не тем, то выдаст ошибку
            //Прериваем цикл кормления если животное наелось
            if (animal.hungry>=0){
                System.out.println(animal.name+" сыт");
                break;
            }
        }

    }



    public static void main(String[] args) throws EatException {
        /*--------------------Создание хищников----------------------*/
        Lion simba = new Lion("Симба",-15);
        Lion mufsa = new Lion("Муфаса",-40);
        Lion shram = new Lion("Шрам",-40);
        Lion bonifaci = new Lion("Бонифаций",-45);
        Cheetah chester = new Cheetah("Честор", -20);
        /*--------------------Создание травоядных----------------------*/
        Koala vasya = new Koala("Вася", -10);
        Monkey tarzan = new Monkey("Тарзан", -20);
        Monkey kigKong = new Monkey("Кинг-Конг",-3000);
        Monkey cezor = new Monkey("Цезорь",-30);
        Monkey sunUkun = new Monkey("Сунь Укун",0);
        Duck donald = new Duck("Дональд", - 20 );
        System.out.println("------------Создание первой клетки-------------------------");
        Aviary forPredator = new Aviary("кабинет №23",4,true);// Создаем клетку forPraedator
        /*ПРОВЕРКА*/ Aviary error = new Aviary("errot",-1, false);
        System.out.println();
        System.out.println("----------Добавление зверей в клетку forPredator-------------------");
        forPredator.addAnimal(shram);// Добавляем хищников в клетку forPredator
        /*ПРОВЕРКА*/forPredator.addAnimal(vasya);// Пробуем в клетку для хищников заселить травоядную Коалу (Вася не может жить в этой клетке)
        forPredator.addAnimal(chester);// Добавляем хищников в клетку forPredator
        forPredator.addAnimal(simba);// Добавляем хищников в клетку forPredator
        forPredator.addAnimal(mufsa);// Добавляем хищников в клетку forPredator
        /*ПРОВЕРКА*/forPredator.addAnimal(bonifaci);// Пробуем занять пятое место (Бонифаций, извини, мест нет)
        System.out.println();

        System.out.println("------------Создание второй клетки-------------------------");
        Aviary forHerbivores = new Aviary("кабинет №403",8,false);// Создаем клетку forHerbivores
        System.out.println();

        System.out.println("----------Добавление зверей в созданную клетку forHerbivores-------------------");
        /*Проверка*/forHerbivores.addAnimal(bonifaci);//Пробуем в клетку для травоядных заселить хищного Льва (Бонифаций не может жить в этой клетке)
        forHerbivores.addAnimal(kigKong);//Добавляем травоядных в клетку for Herbivores
        forHerbivores.addAnimal(sunUkun);//Добавляем травоядных в клетку for Herbivores
        forHerbivores.addAnimal(cezor);//Добавляем травоядных в клетку for Herbivores
        forHerbivores.addAnimal(donald;//Добавляем травоядных в клетку for Herbivores
        forHerbivores.addAnimal(tarzan);//Добавляем травоядных в клетку for Herbivores
        /*Проверка*/forHerbivores.addAnimal(vasya);//Пробуем занять пятое место (Вася, извини, мест нет)
        System.out.println();

        System.out.println("----------Обращение к в животным в клетках-------------------");
        //forHerbivores.getAnimal(cezor,2); // возможность обращения
        forPredator.getAnimal(1); // возможность обращения
        System.out.println();
        System.out.println("----------Кормление зверя и мясом и травой-------------------");
        try {
        feedAnimal(chester,5);// перекормили Честора
        }catch (EatException e){
            System.err.println(e.getMessage());
        }
        try {
        feedAnimal(tarzan,19);// недокормили Тарзана
        }catch( EatException e){
            System.err.println(e.getMessage());
        }

    }

}