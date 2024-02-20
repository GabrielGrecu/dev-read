package com.dev.lazyEager;

public class MySingletonInstanceEager {
    private static MySingletonInstanceEager instance = new MySingletonInstanceEager();
    private MySingletonInstanceEager(){

    }
    public static MySingletonInstanceEager getInstance(){
        return instance;
    }
}
