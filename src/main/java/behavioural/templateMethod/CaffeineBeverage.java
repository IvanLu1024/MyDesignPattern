package behavioural.templateMethod;

/**
 * 冲泡饮料的行为
 * 抽象类
 */
public abstract class CaffeineBeverage {


    final void prepareRecipe() {
        boilWater();//烧开水
        brew();//酿造
        pourInCup();//将水倒入杯子
        addCondiments();//添加其他配料
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("boilWater");
    }
    void pourInCup() {
        System.out.println("pourInCup");
    }

}
