package com.codegym.task.task15.task1522;

public class Earth implements Planet{
    private static Earth instance;

    private Earth()
    {
        // private constructor
    }

    //method to return instance of class
    public static Earth getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new Earth();
        }
        return instance;
    }
}
