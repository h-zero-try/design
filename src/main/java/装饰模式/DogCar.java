package 装饰模式;

public abstract class DogCar extends Dog {
    Dog dog;
    public DogCar(){

    }
    public DogCar(Dog dog){
        this.dog=dog;
    }
    public abstract int go();

}
