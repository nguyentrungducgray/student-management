/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

/**
 *
 * @author trung
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private float gpa;

    public Student(String id, String name, int age, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student() {
    }
    
   @Override
    public String toString() {
        return String.format("%-12s%-15s%-9d%-7.2f%-12s", id, name, age, gpa, getRanking());
    }

    public String getRanking() {
        if (gpa < 5.0) {
            return "Fail";
        } else if (gpa < 6.5) {
            return "Medium";
        } else if (gpa < 7.5) {
            return "Good";
        } else if (gpa < 9.0) {
            return "Very Good";
        } else {
            return "Excellent";
        }
    }
}
