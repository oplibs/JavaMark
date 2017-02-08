package cn.mzen.tips;

// import org.apache.logging.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// import org.apache.logging.log4j.Level;
/**
 * Created by itrek on 11/18/16.
 */
public class FunctionTips {
    static Logger logger = LogManager.getLogger(FunctionTips.class.getName());
    public FunctionTips() {
        // this.showParameters();
        this.showParametersAgain();
        //可以参考 http://www.cnblogs.com/laipdidi/articles/2524309.html
    }

    public void showParameters(){
        int a;
        int b;
        StringBuffer c;
        StringBuffer d;
        a = 0;
        b = a;
        c = new StringBuffer("This is c");
        d = c;

        a = 2;
        c.append("!!");

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }

    public void changeData(StringBuffer strBuf) {
        StringBuffer sb2 = new StringBuffer("Hi ");
        strBuf = sb2;
        sb2.append("World!");
    }

    public void showParametersAgain(){
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println("Before change, sb = " + sb);
        this.changeData(sb);
        System.out.println("After changeData(n), sb = " + sb);
    }
}
