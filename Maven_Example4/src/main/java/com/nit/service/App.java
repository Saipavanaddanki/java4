package com.nit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger  logger=LoggerFactory.getLogger(App.class);
	public static int add(int i,int j) {
		logger.debug("we are in addition method starting level");
		int c=i+j;
		logger.debug("we are in addition method ending level");
		return c;
	
	}
	public static int  sub(int i,int j) {
		logger.debug("sub is created");
		int c=i-j;
		logger.debug("sub is ending");
		return c;
	}
    public static void main( String[] args )
    { logger.debug("main is started");
        int a=30;
        logger.debug(a+"one value initialized");
        int b=40;
        logger.debug(b+"another value initialized");
        logger.debug("addition is creating");
        int c=App.add(a,b);
        logger.info(c+"addition is generated");
        int d=App.sub(a, b);
        logger.info(d+"substraction is generated");
        logger.debug("main is ended");
    }
}
