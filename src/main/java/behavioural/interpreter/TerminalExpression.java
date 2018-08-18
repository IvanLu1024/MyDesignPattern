package behavioural.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {

    private String literal=null;

    public TerminalExpression(String literal) {
        this.literal = literal;
    }



    @Override
    public boolean interpret(String str) {
        //构造一个用来解析str的StringTokenizer对象。
        // java默认的分隔符是“空格”、“制表符(‘\t’)”、“换行符(‘\n’)”、“回车符(‘\r’)”
        StringTokenizer tokenizer=new StringTokenizer(str);

        while (tokenizer.hasMoreTokens()){
            String test = tokenizer.nextToken();
            if (test.equals(literal))
                return true;
        }
        return false;
    }
}
