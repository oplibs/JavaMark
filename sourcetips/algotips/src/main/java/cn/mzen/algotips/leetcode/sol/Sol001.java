package cn.mzen.algotips.leetcode.sol;

import java.util.HashMap;

/**
 * Created by itrek on 12/20/16.
 */
public class Sol001 extends Solution{
    private String TAG = "Sol 001";
    public Sol001(){
        super();
    }

    public void run(String args){
        System.out.println(this.TAG+" run start!");
        String[] params = args.split(";");
        for(String item: params){
            System.out.println(item);
        }
        this.execute();
        System.out.println(this.TAG+" run end!");
    }
    private void execute(){
        HashMap<Integer, Integer>  valueDict = new HashMap<Integer, Integer>();
        return;
    }
}
