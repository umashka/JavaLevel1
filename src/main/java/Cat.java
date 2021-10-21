public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void Run(int distance) {
        if (distance > 0 && distance <= 200)
            System.out.println(this.Name + " run " + distance + "m.!");
        else
            System.out.println(this.Name + " cannot run " + distance + "m. :(");
    }

    @Override
    public void Swim (int distance){
        System.out.println(this.Name + " afraid of water!!! ");
    }
}
