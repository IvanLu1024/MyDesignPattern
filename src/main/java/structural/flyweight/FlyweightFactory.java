package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

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
