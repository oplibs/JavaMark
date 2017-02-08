package cn.mzen.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/12/23 17:21
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class Bar {
    static final Logger logger = LogManager.getLogger(Bar.class);
    public boolean doIt(){
        logger.traceEntry();
        logger.error("Did it again!");
        return logger.traceExit(false);
    }
}
