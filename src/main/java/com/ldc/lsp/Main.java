package com.ldc.lsp;

import java.util.HashMap;
import java.util.Map;

/**   
 * @author liandecai
 * @time Mar 9, 2014
 */
public class Main {

    public static void invok(Animal animal) {
        animal.fun1();
    }
    
    public static void invok2(Animal animal) {
        animal.fun2(new HashMap());
    }
    
    public static void main(String[] args) {
//        invok(new Animal());
//        invok(new Cow());
        Animal a = new Animal();
        Cow c = new Cow();
        HashMap map = new HashMap();
        a.fun2(map);
        c.fun2(map);
//        invok2(c);
    }
}

