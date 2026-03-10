package com.basics.arrays;
// Arrays of Objects {Students} {interns} {books} {pens} {bikes}
class Student {
    String name;
    int USN;
}
class Intern{
    String name;
    int id;
    Intern(String name, int id){
        this.name = name;
        this.id = id;
    }
}
public class E8 {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5};
        Student[] students = new Student[3];
        // {student[0]{}, student[1]{}, student[2]{} }
        students[0] = new Student();
        students[0].name ="SHARAN";
        students[0].USN = 95;
        System.out.println(students[0].name+" " + students[0].USN+" ");
        Intern[] interns = new Intern[]{
                new Intern("Sahana",101),
                new Intern("Harsha",104),
                new Intern("Raju",125)
        };
        for (Intern i: interns){
            System.out.println(i.name+", "+i. id);
        }
    }
}
