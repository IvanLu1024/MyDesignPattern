package behavioural.state;

/**
 *
 * 封装与Context的一个特定状态相关的行为
 */
public interface VoteState {

    /**
     * 状态对应的处理方法
     *
     */
     void vote(String user,String voteItem, VoteManager voteManager);

}



