package behavioural.state;

public class NormalVoteState implements VoteState {


    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getVoteMap().put(user,voteItem);
        System.out.println("恭喜您投票成功！");

    }
}
