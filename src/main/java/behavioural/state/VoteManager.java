package behavioural.state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

    private VoteState voteState=null;

    //记录用户的投票结果
    private Map<String,String> voteMap=new HashMap<String, String>();

    //记录用户的投票次数
    private Map<String,Integer> voteCountMap=new HashMap<String, Integer>();

    public Map<String, String> getVoteMap() {
        return voteMap;
    }

    /**
     * 投票
     * @param user 投票人，为了简单，就是用户名称
     * @param voteItem 投票的选项
     */
    public void vote(String user,String voteItem){
        //1：先为该用户增加投票的次数
        //先从记录中取出已有的投票次数
        Integer oldVoteCount = voteCountMap.get(user);
        if(oldVoteCount==null){
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        voteCountMap.put(user, oldVoteCount);
        //2：判断该用户投票的类型，就相当于是判断对应的状态
        //到底是正常投票、重复投票、恶意投票还是上黑名单的状态
        if(oldVoteCount==1){
            voteState = new NormalVoteState();
        }else if(oldVoteCount>1 && oldVoteCount<5){
            voteState = new RepeatVoteState();
        }else if(oldVoteCount >= 5 && oldVoteCount<8){
            voteState = new SpiteVoteState();
        }else if(oldVoteCount>=8){
            voteState = new BlackVoteState();
        }

        //然后转调状态对象来进行相应的操作
        voteState.vote(user, voteItem, this);
    }



}
