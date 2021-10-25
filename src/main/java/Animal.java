import java.io.Console;

public class Animal {
    public String Name;

    public Animal(String name){
        this.Name = name;
    }

    public void Run(int distance){
        System.out.println("Run, baby, run!");
    }
    public void Swim(int distance){
        System.out.println("Swim, baby, swim!");
    }
}
