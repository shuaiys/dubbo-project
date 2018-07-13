package com.shuaiys.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @ClassName Application
 * @Description TODO
 * @author shuaiys
 * @date 2018/07/13 13:53
 *
 */
public class Application {

    public static final String SERVICE_PROVIDER_XML = "spring/demo-service.xml";
    
    private ClassPathXmlApplicationContext context;
    
    static Application instance = new Application();
    
    private Application() {
        context= new ClassPathXmlApplicationContext(
            new String[] {SERVICE_PROVIDER_XML});   
    }
    
    public static Application getInstance() {
        return instance;
    }

    public ClassPathXmlApplicationContext getContext() {
        return context;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String bean) {
        return (T) getInstance().getContext().getBean(bean);
    }
    
    public static <T> T getBean(String bean, Class<T> type) {
        return getInstance().getContext().getBean(bean, type);
    }
    
}
