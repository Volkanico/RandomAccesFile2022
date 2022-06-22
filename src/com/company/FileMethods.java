package com.company;

import java.util.ArrayList;

public class FileMethods {
    File file = new File("test");

    ArrayList <File> files = new ArrayList<File>();


    //Method to create new file
    public void createFile(String name) {
        file.setName(name);
    }
    //Edit the file created
    public void editFile(String text) {
        file.setText(text);
    }

    //Method to save file
    public void saveFile(File file) {
        files.add(file);
    }
    //Method to open file
    public void openFile(File file) {
        files.add(file);
    }

    //Method to delete file
    public void deleteFile(File file) {
        files.remove(file);
    }

}
