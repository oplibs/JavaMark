package cn.mzen.tips;

// import org.apache.logging.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// import org.apache.logging.log4j.Level;
/**
 * Created by itrek on 11/18/16.
 */
public class Basic {
    static Logger logger = LogManager.getLogger(Basic.class.getName());
    public Basic() {
        this.valueandid();
    }

    class CObject extends Object{
        String name;
        public CObject(){
            this.name = "CObject";
        }
    }

    public void valueandid(){

        // valueOf 来自string， hashCode和equals都是来自object衍生的。
        //
        logger.error("---------------Test the valueOf Data!---------------");
        logger.warn("Test the valueOf String");
        String SVal = "name";
        System.out.println(String.valueOf(SVal));
        System.out.println(SVal.hashCode());

        logger.info("Test the valueOf Integer");
        Integer IVal = 8;
        System.out.println(String.valueOf(IVal));
        System.out.println(IVal.hashCode());

        logger.info("Test the valueOf class");
        CObject cObject = new CObject();
        System.out.println(String.valueOf(cObject));
        System.out.println(cObject.hashCode());
    }
}
