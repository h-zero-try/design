package 工厂模式;

public class DogFartory extends Factory {
    @Override
    public Animal creat() {
        return new Dog();
    }
}
