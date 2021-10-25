public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public String toString() {
        // переделала метод info()
        return "plate: " + food;
    }

    public  int getFood(){
        return this.food;
    }

    // Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
    // количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    public void decreaseFood(int n) {
        food -= (food - n >= 0)? n : n - food;
    }

    // Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood(int n){
        this.food += (n > 0)? n : 0;
    }
}
