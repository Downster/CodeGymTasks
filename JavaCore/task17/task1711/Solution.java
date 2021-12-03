package com.codegym.task.task17.task1711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static SimpleDateFormat inputFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    public static SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case "-c": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 3) {
                            String name = args[i];
                            String sex = args[i + 1];
                            Date bd = inputFormat.parse(args[i + 2]);
                            Person person = sex.equals("m") ? Person.createMale(name, bd) : Person.createFemale(name, bd);
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                    }
                    break;
                }
                case "-u": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i = i + 4) {
                            int index = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            String sex = args[i + 2];
                            Date bd = inputFormat.parse(args[i + 3]);
                            Person person = sex.equals("m") ? Person.createMale(name, bd) : Person.createFemale(name, bd);
                            allPeople.set(index, person);
                        }
                    }
                    break;
                }
                case "-d": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            int index = Integer.parseInt(args[i]);
                            allPeople.get(index).setName(null);
                            allPeople.get(index).setSex(null);
                            allPeople.get(index).setBirthDate(null);
                        }
                        break;
                    }
                }
                case "-i": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            int index = Integer.parseInt(args[i]);
                            Sex sex = allPeople.get(index).getSex();
                            if (sex.equals(Sex.MALE)) {
                                System.out.println(allPeople.get(index).getName() + " m " + outputFormat.format(allPeople.get(index).getBirthDate()));
                            } else {
                                System.out.println(allPeople.get(index).getName() + " f " + outputFormat.format(allPeople.get(index).getBirthDate()));
                            }

                        }
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }
    }
}
