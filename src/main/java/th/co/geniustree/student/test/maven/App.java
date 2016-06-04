/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.student.test.maven;

/**
 *
 * @author Suttipong
 */
public class App {
    public static void main(String[] args) {
        Student st = new Student(987,"Suttipong");
        change(st);
        System.out.println(st.name);
    }
    public static void change(Student st){
        st = new Student(876, "Chaunket");
    }
    
}
class Student{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
