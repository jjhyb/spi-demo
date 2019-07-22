package com.yibo.spi;

/**
 * @author: huangyibo
 * @Date: 2019/7/22 21:36
 * @Description:
 */
public class OracleDriver implements DataBaseDriver{

    @Override
    public String connect(String host) {
        return "begin build Oracle connect："+host;
    }
}
