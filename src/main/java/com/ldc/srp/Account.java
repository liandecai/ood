package com.ldc.srp;

/**   
 * @author liandecai
 * @time Mar 9, 2014
 */
public class Account {
    int id;
    String name;
    int money;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    
    public void saveMoney(int money) {
        this.money += money;
    }
}

