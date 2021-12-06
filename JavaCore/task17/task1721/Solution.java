package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        String line;
        try{
        BufferedReader br = new BufferedReader(new FileReader(fileName1));
        while ((line = br.readLine()) != null) {
            allLines.add(line);
        }
        br.close();
        BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
        while ((line = br2.readLine()) != null) {
            linesForRemoval.add(line);
        }
        br2.close();


        new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Exception caught");
        }




    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
            }
        }

    }
