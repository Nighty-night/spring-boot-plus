package com.example.corpout.util;

import io.geekidea.springbootplus.framework.common.exception.BusinessException;

/**
 * 转换处理
 */
public class ChgUtil {
    private static final String DEFAULT_CHARSET = "GBK";

    public static String subByte2Str(String str,int start,int length) throws Exception {
        return subByte2Str(str, start, length, DEFAULT_CHARSET);
    }

    /**
     * 字符串转成字节，并要知道字节位置
     * @param str 要截取的字符串
     * @param start 开始字节位置
     * @param length 开始
     * @param charset 编码
     * @return
     * @throws Exception
     */
    public static String subByte2Str(String str,int start,int length,String charset) throws Exception {
        byte[] olds = str.getBytes(charset);
        byte[] news = new byte[length];
        if(start > olds.length){
            throw new BusinessException("截取的字节位置超过原字节");
        }
        if(length > olds.length){
            throw new BusinessException("截取的字节长度超过原字节");
        }
        System.arraycopy(olds, start, news, 0, length);
        String result = new String(news, charset);
        return result;
    }

    /**
     *xml报文结束，没有后续信息
     */
    public static String subStr2XmlAngel(String str,int start) throws Exception{
        byte[] olds = str.getBytes(DEFAULT_CHARSET);
        int length = olds.length - start;
        if(length < 0){
            return "";
        }
        return subByte2Str(str,start,length,DEFAULT_CHARSET);
    }

}
