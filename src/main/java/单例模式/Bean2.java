package 单例模式;

//饿汉
public class Bean2 {
    private static Bean2 bean2 = new Bean2();
    private Bean2(){}
    private static Bean2 getBean2(){
        return bean2;
    }
}
