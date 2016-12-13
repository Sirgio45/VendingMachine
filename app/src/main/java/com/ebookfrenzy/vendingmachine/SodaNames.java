package com.ebookfrenzy.vendingmachine;

/**
 * Created by sergio on 12/13/2016.
 */

public class SodaNames
{
    private String nameOfSodas;
    private int inventorySoda=20;
    final double sodaPrice=1.50;
    private static double finalTotal;





    public SodaNames (String name)
    {
        this.nameOfSodas=name;
    }

    public String getNameOfSodas()
    {
        return this.nameOfSodas;
    }


    public int getInventorySoda()
    {
        return this.inventorySoda;
    }

    public void setInventorySoda(int inventorySoda)
    {
        this.inventorySoda = inventorySoda;
    }





}
