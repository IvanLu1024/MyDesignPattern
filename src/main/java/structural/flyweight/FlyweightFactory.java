package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂，主要用来创建并管理共享的享元对象，并对外提供访问共享享元的接口。
 */
public class FlyweightFactory {

    private Map<String,Flyweight> flyweights=new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String intrinsicState){
        if (!flyweights.containsKey(intrinsicState)){
            ConcreteFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState,flyweight);

        }
        return flyweights.get(intrinsicState);


    }

}
