package com;

import org.springframework.boot.SpringApplication;

import java.util.Properties;

public class NacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class, args);
    }

    /**
     * @return 
     */
    public static boolean isOSLinux() {
        Properties prop = System.getProperties();
        String os = prop.getProperty("os.name");
        if (os != null && os.toLowerCase().contains("linux")) {
            return true;
        } else {
            return false;
        }
    }
}
