package com.shuaiys.server;

import com.shuaiys.utils.Application;
import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.TimeZone;

public class AppStart {

    private static final Logger log = Logger.getLogger(AppStart.class);
    
    public static final String SERVICE_PROVIDER_XML = "spring/demo-service.xml";
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        TimeZone timeZone = cal.getTimeZone();
        log.info("TimeZoneId:"+timeZone.getID());
        log.info("TimeZoneDisp:"+timeZone.getDisplayName());
        log.info("开始启动demo service，载入的配置文件为[" + Application.SERVICE_PROVIDER_XML + "]");
        Application.getInstance().getContext().start();
        
        log.info("demo service启动完毕，请查看日志");
        while (true) {
            try {
                Thread.currentThread();
                Thread.sleep(30000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
