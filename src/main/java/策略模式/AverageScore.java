package 策略模式;

public class AverageScore {
    Strategy strategy;
    public void setBean(Strategy strategy){
        this.strategy = strategy;
    };
    public double use(double a){
      return strategy.suanFa(a);
    };
}
