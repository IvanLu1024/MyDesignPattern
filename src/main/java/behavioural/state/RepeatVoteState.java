package behavioural.state;

public class RepeatVoteState implements VoteState {


    public void vote(String user, String voteItem, VoteManager voteManager) {

        System.out.println("请不要重复投票！");

    }
}
