package com.ldc.dip;

/**   
 * @author liandecai
 * @time Mar 9, 2014
 */
public class Main {
    public static void eatFruit(Fruit fruit) {
        fruit.eat();
    }
    
    public static void main(String[] args) {
        eatFruit(new Lemon());
        eatFruit(new Apple());
    }
}

