package com.liumapp.KeyGenerator.pattern;

/**
 * Created by liumapp on 9/29/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class KeyPattern {

    /**
     * 别名
     */
    private String alias;

    /**
     * 密钥库名称
     */
    private String keystore;

    /**
     * 密钥库密码
     */
    private String storepass;

    /**
     * 加密算法
     */
    private String keyalg = "RSA";

    /**
     * 证书有效期天数
     */
    private Integer validity;

    /**
     * 密钥长度
     */
    private Integer keysize = 2048;

    /**
     * 私钥密码
     */
    private String keypass;

    /**
     * 密钥对拥有者名字
     */
    private String firstname;

    /**
     * 密钥对拥有者姓字
     */
    private String lastname;



}
