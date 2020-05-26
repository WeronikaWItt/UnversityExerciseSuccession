package com.company;

public class Data {
    public static void getUserInput(){
        StudentsClass student = new StudentsClass();
        String userInput;
        byte[] dataTable = new byte[200];

        try {
            System.in.read(dataTable);
            userInput = new String(dataTable);
            student.setName(userInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
