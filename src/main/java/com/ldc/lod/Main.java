package com.ldc.lod;

import com.ldc.lod.after.AFather;
import com.ldc.lod.after.ASon;
import com.ldc.lod.before.Father;
import com.ldc.lod.before.Son;

/**   
 * @author liandecai
 * @time Mar 10, 2014
 */
public class Main {
    public static void main(String[] args) {
//        Father f = new Father();
//        f.askSon(new Son());
        AFather af = new AFather();
        af.askSon(new ASon());
    }
}

