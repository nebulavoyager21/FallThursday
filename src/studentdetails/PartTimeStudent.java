/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetails;

/**
 *
 * @author abdul
 */
// This is the PartTimeStudent class
public class PartTimeStudent {
    private int sid;
    private String name;
    private int hoursWorked;

    // Default constructor
    public PartTimeStudent() {
    }

    // Parameterized constructor
    public PartTimeStudent(int sid, String name, int hoursWorked) {
        this.sid = sid;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
