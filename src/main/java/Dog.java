public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void Run(int distance) {
        if (distance > 0 && distance <= 500)
            System.out.println(this.Name + " run " + distance + "m.!");
        else
            System.out.println(this.Name + " cannot run " + distance + "m. :(");
    }

    @Override
    public void Swim (int distance){
        if (distance > 0 && distance <= 10)
            System.out.println(this.Name + " swim " + distance + "m.!");
        else
            System.out.println(this.Name + " cannot swim " + distance + "m. :(");
    }
}
