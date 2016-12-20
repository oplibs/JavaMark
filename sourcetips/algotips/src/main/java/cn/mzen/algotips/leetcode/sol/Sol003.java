package cn.mzen.algotips.leetcode.sol;

/**
 * Created by itrek on 12/20/16.
 */
public class Sol003 extends Solution{
    private String TAG = "Sol 003";
    public Sol003(){
        super();
    }

    public void run(String args){
        System.out.println(this.TAG+" run start!  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String[] params = args.split(";");
        this.execute(params[0]);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+this.TAG+" run end!");
    }
    private void execute(String s){
        System.out.println(s);
        return;
    }
}
