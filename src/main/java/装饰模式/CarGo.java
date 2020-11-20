package 装饰模式;

public class CarGo extends DogCar {
    public static int CM = 100;
    public int go() {
        return CM;
    }

    CarGo(Dog dog){
        super(dog);
    };
    public int run() {
        int cm = 0;
        cm=dog.run()+go();
        return cm;
    }
}
