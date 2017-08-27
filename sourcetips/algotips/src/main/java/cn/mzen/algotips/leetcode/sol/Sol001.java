package cn.mzen.algotips.leetcode.sol;

import cn.mzen.algotips.base.*;

// import java.io.StringReader;
// import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;

/**
 * Created by itrek on 12/20/16.
 */
public class Sol001 extends Solution{
    private String TAG = "Sol 001";
    public Sol001(){
        super();
    }

    public void run(String args){
        super.run(args);
    }

    public void processCase(String data) {
        String[] params = data.split(":");

        Integer target = Integer.parseInt(params[0]);
        List list = FileLoader.getIntegerArray(params[1]);

        this.execute(target, list);
    }

    private void execute(Integer target, List list){
        System.out.println("Test satrt: "+target);
        /*
        HashMap<Integer, Integer>  valueDict = new HashMap<Integer, Integer>();
        return;
        */
    }
}
