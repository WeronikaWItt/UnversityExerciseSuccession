package com.company;

class StudentsClass extends SchoolStudent {
    String StudentsClass;

    void setStudentsClass(String newStudentsClass) {
        StudentsClass = newStudentsClass;
    }

    public static void GetStudentsInfo(){
        StudentsClass student1 = new StudentsClass();
        System.out.println("Type in name");
    }

}
