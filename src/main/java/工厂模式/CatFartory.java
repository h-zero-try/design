package 工厂模式;

public class CatFartory extends Factory {
    @Override
    public Animal creat() {
        return new Cat();
    }
}
