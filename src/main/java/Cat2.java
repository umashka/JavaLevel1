public class Cat2 {
    private String name;
    private int appetite;

    // Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    private Boolean satiety;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    // Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
    // то есть не может быть наполовину сыт.
    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            this.satiety = true;
        }
    }

    public String toString(){
        return this.name + " (appetite = " + this.appetite + "), satiety: " + this.satiety;
    }
}
