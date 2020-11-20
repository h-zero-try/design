package 单例模式;

//懒汉
//public class Bean {
//
//    private Bean(){}
//    private static Bean bean = null;
//
//    public static Bean getBean(){
//        if(bean == null){
//            bean = new Bean();
//        }
//        return bean;
//    }
//
//
//}

//加锁防止两个线程同时判空，创建两个对象，并发性能差，一个一个进
//public class Bean {
//
//    private Bean(){}
//    private static Bean bean = null;
//
//    public static synchronized Bean getBean(){
//        if(bean == null){
//            bean = new Bean();
//        }
//        return bean;
//    }
//
//
//}
//双重校验锁，如果已经实例化了就直接获取对象，否则加锁，并发安全，性能优化
//volatile防止指令重排
public class Bean {
    private Bean(){}
    private static volatile Bean bean ;

    public static  Bean getBean(){
        if(bean==null) {
            synchronized(Bean.class) {
                if (bean == null) {
                    bean = new Bean();
                }
            }
        }
        return bean;
    }
}

