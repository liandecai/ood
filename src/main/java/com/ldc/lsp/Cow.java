package com.ldc.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liandecai
 * @time Mar 9, 2014
 */
public class Cow extends Animal {

    public void fun1() {
        System.out.println("cow fun1 invok");
    }
    
    public void fun2(HashMap map){
        System.out.println("cow fun2 invok");
    }

//    public void fun2(Map map) {
//        System.out.println("cow fun2 invok");
//    }
}
