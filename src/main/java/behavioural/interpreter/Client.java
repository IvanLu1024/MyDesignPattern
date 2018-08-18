package behavioural.interpreter;

public class Client {

    public static Expression buildInterpreterTree(){
        //literal
        TerminalExpression terminal1 = new TerminalExpression("A");
        TerminalExpression terminal2 = new TerminalExpression("B");
        TerminalExpression terminal3 = new TerminalExpression("C");
        TerminalExpression terminal4 = new TerminalExpression("D");
        //B C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        //A or (B C)
        Expression alternation2=new OrExpression(terminal1,alternation1);
        //D and A or (B C)
        return new AndExpression(terminal4,alternation2);
    }

    public static void main(String[] args) {
        Expression define=buildInterpreterTree();
        String context1="D A";
        String context2="A B";

        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));



    }
}
