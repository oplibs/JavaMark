package cn.mzen.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/12/26 10:36
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class Test {
    static Logger logger = LogManager.getLogger("test");

    public static void main(String[] args) {
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
