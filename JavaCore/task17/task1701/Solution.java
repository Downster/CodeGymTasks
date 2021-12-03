package com.codegym.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Notes

*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class NoteThread extends Thread {
        @Override
        public void run() {
            int i = 0;
            try {
                while (true) {
                    if (i == 1000) {
                        break;
                    }
                    Note.addNote(getName() + "-Note" + i);
                    Thread.sleep(1);
                    Note.removeNote(getName());
                    i++;
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Another thread deleted our note");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Thread [" + threadName + "] deleted someone else's note [" + note + "]");
            } else {
                System.out.println("Thread [" + threadName + "] deleted its own note [" + note + "]");
            }
        }
    }
}
