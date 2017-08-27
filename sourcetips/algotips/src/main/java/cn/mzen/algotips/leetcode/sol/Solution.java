package cn.mzen.algotips.leetcode.sol;

import cn.mzen.algotips.base.FileLoader;

/**
 * Created by itrek on 12/20/16.
 */
abstract public class Solution {
    private String TAG = "Solution";
    public Solution(){
        System.out.println(this.TAG+" inited!");
    }

    abstract void processCase(String data);

    public void run(String args){
        System.out.println(this.TAG+" run start!");

        FileLoader loader = new FileLoader();
        loader.loadFile(args);

        String casedata = null;
        System.out.println("Start test case!");
        while((casedata = loader.loadCase())!=null) {
            System.out.println("Case data is as following:"+casedata);
            processCase(casedata);
        }
        System.out.println("Finish test case!");
    }
}
