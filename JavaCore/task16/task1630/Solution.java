package com.codegym.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (Exception e) {
        }
    }



    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName;
        String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }
         public void run() {
             String line;
             try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                 while ((line = br.readLine()) != null) {
                     fileContent += line + " ";
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }

        @Override
        public String getFileContents() throws IOException {
                return fileContent;


        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContents());

    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

}
