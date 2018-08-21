package behavioural.state;

public class BlackVoteState implements VoteState {


    public void vote(String user, String voteItem, VoteManager voteManager) {

        System.out.println("您进入了黑名单，将禁止使用本系统！");

    }
}
