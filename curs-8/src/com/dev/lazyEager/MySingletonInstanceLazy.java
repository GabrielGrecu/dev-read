package com.dev.lazyEager;

public class MySingletonInstanceLazy {
    /**
     *   asta e varianta lazy
     *   doar daca mi o cere cineva o creez,
     *   si practic pana nu scriu
     *   MySingletonInstance mySingletonInstance = MySingletonInstance.getInstance();
     *   nu creez instanta din prima
     */
    //asta e varianta lazy
    //doar daca mi o cere cineva o creez, si practic pana nu scriu MySingletonInstance mySingletonInstance = MySingletonInstance.getInstance(); nu creez instanta din prima
    private static MySingletonInstanceLazy instance;
    private MySingletonInstanceLazy(){

    }
    public static MySingletonInstanceLazy getInstance(){
        if(instance == null){
            instance = new MySingletonInstanceLazy();
        }
        return instance;
    }
}
