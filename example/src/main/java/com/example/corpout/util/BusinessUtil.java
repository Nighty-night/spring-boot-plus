package com.example.corpout.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 业务相关
 */
public class BusinessUtil {

    public static Map<String, String> head2Map(String str) throws Exception{
        Map<String, String> map = new HashMap<>(23);
        //1、报文类别和目标系统编号	Char (6)	Y	填A00101
        String typeAndSyscode = ChgUtil.subByte2Str(str, 0, 6);
        //其中报文类别为A001
        String packetsType = ChgUtil.subByte2Str(str, 0, 4);
        //其中目标系统编码为01
        String sysCode = ChgUtil.subByte2Str(str, 4, 2);
        //2、报文编码	Char (2)	Y	01：GBK缺省 02：UTF8 03：unicode 04：iso-8859-1
        String charSet = ChgUtil.subByte2Str(str, 6, 2);
        //3、通讯协议	Char (2)	Y	01:tcpip 缺省 02：http 03：webservice 现在只支持：TCPIP接入
        String protocol = ChgUtil.subByte2Str(str, 8, 2);
        //4、企业银企直连标准代码	Char (20)	Y	银行提供给企业的20位唯一的标识代码
        String yqdm = ChgUtil.subByte2Str(str, 10, 20);
        //5、接收报文长度	Num(10)	Y	报文数据长度；不包括附件内容、签名内容的长度，不够左补0
        String packetsLength = ChgUtil.subByte2Str(str, 30, 10);
        //6、交易码	Char(6)	Y	交易码，不够右补空格
        String tranCode = ChgUtil.subByte2Str(str, 40, 6);
        //7、操做员代码	Char (5)	N	银行登记使用
        String operatorCode = ChgUtil.subByte2Str(str, 46, 5);
        //8、服务类型	Num (2)	Y	01-请求 02-应答
        String serviceType = ChgUtil.subByte2Str(str, 51, 2);
        //9、交易日期	Num(8)	Y	yyyymmdd
        String tranDate = ChgUtil.subByte2Str(str, 53, 8);
        //10、交易时间	Num (6)	Y	hhmmss
        String tranTime = ChgUtil.subByte2Str(str, 61, 6);
        //11、请求方系统流水号	Char(20)	Y	唯一标识一笔交易
        // 备注：（如果某种交易要有多次请求的才能完成的，多个交易请求包流水号要保持一致）
        String serialNo = ChgUtil.subByte2Str(str, 67, 20);
        //12、返回码	Char(6)	Y	请求非必输
        String respCode = ChgUtil.subByte2Str(str, 87, 6);
        //13、返回描述	Char(100)	N	格式为 “:交易成功”；其中冒号为英文格式半角。
        String respMsg = ChgUtil.subByte2Str(str, 93, 100);
        //14、后续包标志	Char(1)	N	0-结束包，1-还有后续包
        //同请求方流水号一起运作，用于大报文的拆分，请求方系统流水号要和第一次保持一致（未启用）
        String endFlag = ChgUtil.subByte2Str(str, 193, 1);
        //15、请求次数	Char(3)	Y	如果有后续包请求（未启用）第一次000第二次001 第三次002依此增加
        //请求方系统流水号要和第一次保持一致。
        String hitNumber = ChgUtil.subByte2Str(str, 194, 3);
        //16、签名标识	Char(1)	Y	0-不签名 1-签名 （填0，企业不管，由银行客户端完成）
        String signFlag = ChgUtil.subByte2Str(str, 197, 1);
        //17、签名数据包格式	Char(1)	N	0-裸签（填1，企业不管，由银行客户端完成）1-PKCS7
        String signType = ChgUtil.subByte2Str(str, 198, 1);
        //18、签名算法	Char(12)	N	RSA-SHA1
        String signAlgorithm = ChgUtil.subByte2Str(str, 199, 12);
        //19、签名数据长度	Num(10)	Y	签名报文数据长度 0000000000 – 企业不需要签名
        String signLength = ChgUtil.subByte2Str(str, 211, 10);
        //20、附件数目	Num(1)	Y	0-没有；有的话填具体个数。目前最多只支持1个附件，即填写1
        String attachNumber = ChgUtil.subByte2Str(str, 221, 1);//合计：index:0-221 length:222

        map.put("typeAndSyscode",typeAndSyscode);
        map.put("packetsType",packetsType);
        map.put("sysCode",sysCode);
        map.put("charSet",charSet);
        map.put("protocol",protocol);
        map.put("yqdm",yqdm);
        map.put("packetsLength",packetsLength);
        map.put("tranCode",tranCode);
        map.put("operatorCode",operatorCode);
        map.put("serviceType",serviceType);
        map.put("tranDate",tranDate);
        map.put("tranTime",tranTime);
        map.put("serialNo",serialNo);
        map.put("respCode",respCode);
        map.put("respMsg",respMsg);
        map.put("endFlag",endFlag);
        map.put("hitNumber",hitNumber);
        map.put("signFlag",signFlag);
        map.put("signType",signType);
        map.put("signAlgorithm",signAlgorithm);
        map.put("signLength",signLength);
        map.put("attachNumber",attachNumber);
        return map;
    }
}
