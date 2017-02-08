package cn.mzen.tips;

// import org.apache.logging.log4j.PropertyConfigurator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Created by itrek on 11/18/16.
 */
public class TipInterface {
    static Logger logger = LogManager.getLogger(TipInterface.class.getName());
    public TipInterface() {
        logger.debug("start TipInterface");
        this.testInterface();
        logger.debug("end TipInterface");

        logger.debug("start lambda");
        this.testLambda();
        logger.debug("end lambda");
    }

    interface Formula {
        double calculate(int a);

        //在Java8中，利用default关键字使我们能够添加非抽象方法实现的接口。此功能也被称为扩展方法，这里是我们的第一个例子：
        default double sqrt(int a) {
            System.out.println(a);
            return Math.sqrt(a);
        }
        default double root(int a) {
            System.out.println("root");
            return Math.sqrt(a);
        }
    }

    private void testInterface(){
        Formula tip = new Formula(){
            @Override
            public double calculate(int a) {
                logger.debug("call caculate!");
                this.root(a * 100);
                return sqrt(a * 100);
            }
        };
        tip.calculate(10);
    }

    private void testLambda(){
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(names, (String a, String b) -> b.compareTo(a));
    }
}
