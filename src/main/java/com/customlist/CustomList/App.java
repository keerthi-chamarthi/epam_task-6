package com.customlist.CustomList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	CustomList<Integer> c=new CustomList<>();
    	c.add(1);
    	c.add(2);
    	c.add(3);
    	c.add(4);
    	c.add(4);
    	c.add(5);
    	c.add(6);
    	c.add(7);
    	c.add(8);
    	c.add(9);
    	c.add(10);
    	c.print();
    	c.getCapacity();
    }
}
