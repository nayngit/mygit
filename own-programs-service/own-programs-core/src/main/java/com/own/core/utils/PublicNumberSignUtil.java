package com.own.core.utils;

import java.util.Arrays;

import com.own.common.utils.SHA1;

public class PublicNumberSignUtil {

    public static boolean checkSignature(String token, String signature, String timestamp, String nonce) {  
    	String[] arr = new String[] { token, timestamp, nonce };  
        // 将token、timestamp、nonce三个参数进行字典序排序  
        Arrays.sort(arr);  
        
        // 将三个参数字符串拼接成一个字符串进行sha1加密  
        String tmpStr = SHA1.hex_sha1(arr[0] + arr[1] + arr[2]);  
        
        // 将sha1加密后的字符串可与signature对比，标识该请求来源于微信  
        return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false; 
    }  
   
}  
