package com.codegym.task.task15.task1522;

public class Sun implements Planet{ // private instance, so that it can be
        // accessed by only by getInstance() method
        private static Sun instance;

        private Sun()
        {

        }

        //method to return instance of class
        public static Sun getInstance()
        {
            if (instance == null)
            {
                // if instance is null, initialize
                instance = new Sun();
            }
            return instance;
        }
    }
