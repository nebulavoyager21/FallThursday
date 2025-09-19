/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/**
 *
 * @author abdul
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Friday, September 19, 2025
       // print sid, name of 3 students
       
       Student s1 = new Student();
       s1.setName("Athos");
       s1.setSid(35);
       
       Student s2 = new Student();
       s2.setName("Porthos");
       s2.setSid(30);
       
       Student s3 = new Student();
       s3.setName("Aramis");
       s3.setSid(27);
       
       Student[] list = new Student[3]; // array of objects
       list[0] = s1;
       list[1] = s2;
       list[2] = s3; // stored objects
       
       for (int i = 0; i < list.length; i++) {
           System.out.println("SID: " + list[i].getSid() + ", Name: " + list[i].getName());
       }
    }
}

