public class Lesson7 {
    public static void main(String[] args){
        // Лекция:

        Cat2 c = new Cat2("Barsik", 5);
        Plate p = new Plate(100);
        System.out.println(p.toString());
        c.eat(p);
        System.out.println(p.toString());

        // Домашка:

        // Создать массив котов и тарелку с едой,
        // попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Plate plate = new Plate(100);
        Cat2[] cats = new Cat2[3];
        cats[0] = new Cat2("Funtik", 50);
        cats[1] = new Cat2("Timosha", 40);
        cats[2] = new Cat2("Vaska", 30);

        for (Cat2 i: cats) {
            i.eat(plate);
            System.out.println(i.toString());
        }

        // Подсыпем еды для третьего котика, а то чо он!
        plate.increaseFood(20);
        System.out.println(plate.toString());
        cats[2].eat(plate);
        System.out.println(cats[2].toString());

        // Выведено на консоль:
        // Funtik (appetite = 50), satiety: true
        // Timosha (appetite = 40), satiety: true
        // Vaska (appetite = 30), satiety: false
        // plate: 30
        // Vaska (appetite = 30), satiety: true
    }
}
