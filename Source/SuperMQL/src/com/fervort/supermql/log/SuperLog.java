package com.fervort.supermql.log;

import com.fervort.supermql.xml.*;

public class SuperLog {

    private static boolean isDebugEnabled = false;
    private static final String CONFIG_KEY = "EnableDebugging";

    public static void init() {
        if (ConfigReader.readConfigKey(CONFIG_KEY).equalsIgnoreCase("yes")) {
            isDebugEnabled = true;
            System.out.println("=====Debugging Enabled=====");
        }
    }

    public static void debug(String str) {
        if (isDebugEnabled) {
            System.out.println(str);
        }
    }
}
