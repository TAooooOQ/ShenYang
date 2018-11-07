package com.Utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author Ash
 * @date 2018/7/18 11:44
 */
public class MD5Utils {
    public static String toHash(String userName,String password){
        SimpleHash simpleHash=new SimpleHash("md5",password,userName,6);
        return simpleHash.toHex();
    }

}
