package 策略模式;

public class StategyMainApplication {
    public static void main(String [] args){
        AverageScore averageScore = new AverageScore();
        averageScore.setBean(new StrategyA());
        double A = averageScore.use(2);
        System.out.print("A"+A+"-----------");

        averageScore.setBean(new StrategyB());
        double B = averageScore.use(2);
        System.out.print("B"+B);
    }
}
