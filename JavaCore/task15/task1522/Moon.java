package com.codegym.task.task15.task1522;

public class Moon implements Planet{
    private static Moon instance;

    private Moon()
    {
        // private constructor
    }

    //method to return instance of class
    public static Moon getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new Moon();
        }
        return instance;
    }
}
