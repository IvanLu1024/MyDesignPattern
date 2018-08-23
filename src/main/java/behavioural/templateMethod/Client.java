package behavioural.templateMethod;

/**
 * Created by Wei Yu on 2018/8/23.
 */
public class Client {

    public static void main(String[] args) {
        CaffeineBeverage coffee=new Coffee();
        CaffeineBeverage tea=new Tea();
        coffee.prepareRecipe();
        System.out.println("-------------------");
        tea.prepareRecipe();


    }
}
