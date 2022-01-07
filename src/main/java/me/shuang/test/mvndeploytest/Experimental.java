package me.shuang.test.mvndeploytest;

import java.util.logging.Logger;

/**
 * A Test class for exporting maven package. call <code>execute</code> method will print {@value info} by {@link java.util.logging.Logger}
 *
 * @author lishuang
 * @version 0.0.1-SNAPSHOT
 * @see me.shuang.test.mvndeploytest.Experimental
 * @since 2022年1月7日 10点19分
 */
public class Experimental {

    private static final String info = "佛前莲花开三朵";


    /**
     * test static method.
     */
    public static void execute() {
        Logger.getLogger("shuang").info(info);
    }

}
