package cn.mzen.jdklog;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/12/27 10:45
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class JdkLogging {
    static Logger logger = Logger.getLogger(JdkLogging.class.getName());
    public static void main(String[] args) {
        logger.info("jdk logging info");
        logger.info("Main running");
        logger.fine("doing stuff");
        logger.fine("done");
    }
}
