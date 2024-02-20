package com.dev.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class MyCustomBeanProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {
    private BeanFactory beanFactory;
    private List<Object> prototypeBeans = new LinkedList<>();

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        // detectam toate beanurile de tip prototype
        // pentru a putea apela ulterior metode destroy
        if(beanFactory.isPrototype(beanName)){
            synchronized (prototypeBeans){
                prototypeBeans.add(bean);
            }
        }
        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void destroy() throws Exception {
        // iteram prin beanurile de tip prototype
        // si apelam destroy pe cele de tipul DisposableBean
        synchronized (prototypeBeans){
            for(Object bean : prototypeBeans){
                if(bean instanceof DisposableBean){
                    DisposableBean disposableBean = (DisposableBean) bean;
                    try{
                        disposableBean.destroy();
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
