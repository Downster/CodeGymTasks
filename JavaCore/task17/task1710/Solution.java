package com.codegym.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] parameters = input.split(" ");
        String command = parameters[0];
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Person person;
        switch (command) {
            case "-c": {
                String name = parameters[1];
                String sex = parameters[2];
                Date birthdate = sdf.parse(parameters[3]);

                if (sex.equals("m")) {
                    person = Person.createMale(name, birthdate);
                } else {
                    person = Person.createFemale(name, birthdate);
                }
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            }
            case "-u": {
                int id = Integer.parseInt(parameters[1]);
                String name = parameters[2];
                String sex = parameters[3];
                Date birthdate = sdf.parse(parameters[4]);
                if (sex.equals("m")) {
                    allPeople.set(id, Person.createMale(name, birthdate));
                } else {
                    allPeople.set(id, Person.createFemale(name, birthdate));
                }
                break;
            }
            case "-d": {
                int id = Integer.parseInt(parameters[1]);
                allPeople.set(id, Person.createNull());
                break;
            }
            case "-i": {
                int id = Integer.parseInt(parameters[1]);
                String name = allPeople.get(id).getName();
                Sex sex = allPeople.get(id).getSex();
                Date birthdate = allPeople.get(id).getBirthDate();
                SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
                if (sex == Sex.MALE) {
                    System.out.println(name + " m " + sdf.format(birthdate));
                } else {
                    System.out.println(name + " f " + sdf.format(birthdate));
                }
                break;
            }
        }
    }
}
