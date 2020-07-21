package com.keith.springdemo.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, BeanClassLoaderAware{
    public SpringBean() {
        System.out.println("SpringBean 的构造方法：" +  studentService);
        System.out.println("SpringBean 的构造方法");
    }

    @Autowired
    StudentServiceImpl studentService;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader...");
    }

    public void initMethod() {
        System.out.println("initMethod...");
    }

    public void destroyMethod() {
        System.out.println(" destroyMethod ...");
    }
}
