package creative.builder;


import java.util.Arrays;


public class AbstractStringBuilder {
    protected char[] value;
    protected int count;

    public AbstractStringBuilder(int capacity){
        count=0;
        value=new char[capacity];

    }

    public AbstractStringBuilder append(char c){
        ensureCapacityInternal(count+1);
        value[count++]=c;
        return this;

    }

    private void ensureCapacityInternal(int minimumCapacity){
        if (minimumCapacity>value.length){
            expandCapacity(minimumCapacity);
        }


    }
    void expandCapacity(int minimumCapacity){
        int newCapcity=minimumCapacity*2+2;
        if (newCapcity<minimumCapacity){
            newCapcity=minimumCapacity;
        }
        if (newCapcity<0){
            if (minimumCapacity<0)
                throw new OutOfMemoryError();
            newCapcity=Integer.MAX_VALUE;
        }
        value=Arrays.copyOf(value,newCapcity);

    }
}
