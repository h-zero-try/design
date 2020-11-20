package 装饰模式;

public class DogApplication {
    public static void main(String[] args) {
        Dog dog =new RealDog();
        System.out.print(dog.run()+"原来的狗跑那么远");

        dog=new CarGo(dog);
        System.out.print(dog.run()+"一台车加狗跑那么远");

        dog=new CarGo(dog);
        System.out.print(dog.run()+"两台车加狗跑那么远");


    }
}
