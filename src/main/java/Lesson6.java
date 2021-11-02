import java.time.ZonedDateTime;
import java.util.Random;

public class Lesson6 {
    public static void main(String[] args){
        // Создать классы Собака и Кот с наследованием от класса Животное.
        // Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
        // препятствия. Результатом выполнения действия будет печать в консоль.
        // У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
        // плавание: кот не умеет плавать, собака 10 м.).
        Animal a = new Animal("Nobody");
        Cat c = new Cat("Vaska");
        Dog d = new Dog("Bobik");

        a.Run(300); // Run, baby, run!
        c.Run(50);  // Vaska run 50m.!
        d.Run(250); // Bobik run 250m.!

        c.Run(250); // Vaska cannot run 250m. :(
        d.Run(550); // Bobik cannot run 550m. :(

        a.Swim(7);  // Swim, baby, swim!
        c.Swim(3);  // Vaska afraid of water!!!
        d.Swim(5);  // Bobik swim 5m.!

        // Добавить подсчет созданных котов, собак и животных.

        // Заполняю массив рандомными зверушками
        Random rnd = new Random();
        Animal[] zoo = new Animal[10];
        for (int i = 0; i < 10; i++){
            int kind = rnd.nextInt(3);
            switch (kind){
                case 0: zoo[i] = new Animal("Ani-" + i); break;
                case 1: zoo[i] = new Cat("Cat-" + i); break;
                case 2: zoo[i] = new Dog("Dog-" + i); break;
            }
        }

        // Я специально разделила эти процессы: "создание" и "подсчет", чтобы сымитировать ситуацию,
        // когда массив с объектами ко мне пришел бы откуда-то извне (из файла или по сети, например).
        // И я не знаю его размера и кто там есть еще, кроме котов и собак.
        int cats = 0;
        int dogs = 0;
        for (Animal i: zoo) {
            if (i instanceof Cat) cats++;
            if (i instanceof Dog) dogs++;
        }

        System.out.println("Cats = " + cats);
        System.out.println("Dogs = " + dogs);
        System.out.println("Animals (pure) = " + (zoo.length - cats - dogs));

        // На консоль было выведено вот это:
        // Cats = 5
        // Dogs = 1
        // Animals (pure) = 4
    }
}
