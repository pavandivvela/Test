package com.mkyong.common;


import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class AppRandom
{

    public static void main( String[] args )
    {
        AppRandom obj = new AppRandom();
         System.out.println("Hellow world program : welcome ! Pavan " );
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey(){

    	String id = UUID.randomUUID().toString();
    	return id;

    }
}