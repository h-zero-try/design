package 工厂模式;

public class FartoryApplication {
    public static void main(String[] args) {
        Animal d = new DogFartory().creat();
        d.eat();
        Animal c = new CatFartory().creat();
        c.eat();
    }
}
