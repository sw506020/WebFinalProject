package org.wws.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by zjy on 14-1-25.
 */

@Service
public class PropertiesService extends Properties {
    private final Logger logger =  Logger.getLogger(getClass());


    public PropertiesService() {
        try {
            //FileOutputStream fileOutputStream = new FileOutputStream("app.properties");
            this.load(new FileInputStream("src/main/webapp/WEB-INF/app.properties"));
        } catch (Exception e) {
            logger.error("Open properties file error.");
        }
    }

}
