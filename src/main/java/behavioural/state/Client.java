package behavioural.state;

public class Client {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for(int i=0;i<8;i++){
            voteManager.vote("u1","A");
        }

    }
}
