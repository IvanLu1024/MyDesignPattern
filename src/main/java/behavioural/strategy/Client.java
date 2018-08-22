package behavioural.strategy;


public class Client {
    public static void main(String[] args) {
        Duck duck=new Duck();
        duck.setBehavior(new Squeak());
        duck.performQuack();

        duck.setBehavior(new Quack());
        duck.performQuack();


    }




}
