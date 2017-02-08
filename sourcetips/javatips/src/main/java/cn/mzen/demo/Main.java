package cn.mzen.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

import cn.mzen.tips.*;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/12/23 17:17
 *
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        //String srcDir = System.getProperty("user.dir");
        //ConfigurationSource source = new ConfigurationSource(new FileInputStream(new File(srcDir + "\\src\\log4j2.xml")));
        //Configurator.initialize(null, source);
        logger.trace("Entering application.");
        logger.info("myapp start.");
        Bar bar = new Bar();
        logger.warn("invoke bar");
        if (!bar.doIt()){
            logger.error("Didn't do it");
        }
        logger.info("myapp end.");
        logger.trace("Exiting application");

        // TipInterface tips = new TipInterface();
        FunctionTips functips = new FunctionTips();
    }
}
