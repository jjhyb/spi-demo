package com.yibo;

import com.yibo.spi.DataBaseDriver;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        ServiceLoader<DataBaseDriver> serviceLoader = ServiceLoader.load(DataBaseDriver.class);
        System.out.println( "Java SPI" );
        for (DataBaseDriver driver : serviceLoader) {
            System.out.println(driver.connect("localhost"));
        }
    }
}
