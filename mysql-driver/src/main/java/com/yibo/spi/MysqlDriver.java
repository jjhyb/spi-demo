package com.yibo.spi;

/**
 * @author: huangyibo
 * @Date: 2019/7/22 21:33
 * @Description:
 */
public class MysqlDriver implements DataBaseDriver {

    @Override
    public String connect(String host) {
        return "begin build Mysql connect："+host;
    }
}
