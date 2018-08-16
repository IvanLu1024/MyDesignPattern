import creative.builder.StringBuilder;
import org.junit.Test;

public class TestBuilder {
    @Test
    public void test(){
        StringBuilder stringBuilder = new StringBuilder();
        final int count=26;
        for (int i=0;i<count;i++){
            stringBuilder.append((char)('a'+i));
        }
        System.out.println(stringBuilder);

    }
}
