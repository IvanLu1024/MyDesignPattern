package behavioural.state;

public class SpiteVoteState implements VoteState {


    public void vote(String user, String voteItem, VoteManager voteManager) {
        String s = voteManager.getVoteMap().get(user);
        if (s!=null){
            voteManager.getVoteMap().remove(user);
        }
        System.out.println("您有恶意刷票行为，取消您的投票资格！");


    }
}
