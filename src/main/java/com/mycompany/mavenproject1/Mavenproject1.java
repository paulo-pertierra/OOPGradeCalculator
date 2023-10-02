/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String firstName;
        String lastName;
        char sexCode;
        int year;
        String degree;
        String section;
        int nou;
        double prelimGrd;
        double midtermGrd;
        double finalGrd;
        
        try {
            System.out.println("<<<STUDENT DATA ENTRY>>>");
            System.out.print("1] First Name: ");
            firstName = input.nextLine();
            System.out.print("2] Last Name: ");
            lastName = input.nextLine();
            System.out.print("3] Sex Code[M/F]: ");
            sexCode = input.nextLine().charAt(0);
            System.out.print("4] Degree: ");
            degree = input.nextLine();
            System.out.print("5] Section: ");
            section = input.nextLine();
            System.out.print("6] Year: ");
            year = Integer.parseInt(input.nextLine());
            System.out.print("6] Number of Units Enrolled: ");
            nou = Integer.parseInt(input.nextLine());
            System.out.print("6] Prelim Grade: ");
            prelimGrd = Double.parseDouble(input.nextLine());
            System.out.print("6] Midterm Grade: ");
            midtermGrd = Double.parseDouble(input.nextLine());
            System.out.print("6] Final Grade: ");
            finalGrd = Double.parseDouble(input.nextLine());
            
            Student3 student = new Student3(
                firstName,
                lastName,
                sexCode,
                year,
                degree,
                section,
                nou,
                prelimGrd,
                midtermGrd,
                finalGrd
            );
            
            System.out.println("<<<STUDENT DETAILS>>>");
            System.out.println("1] First Name: " + student.getFirstName());
            System.out.println("2] Last Name: " + student.getLastName());
            System.out.println("3] Sex Code[M/F]: " + student.getSex());
            System.out.println("4] Degree: " + student.getDegree());
            System.out.println("5] Section: " + student.getSection());
            System.out.println("6] Year: " + student.getYear());
            System.out.println("7] Rate Per Unit: " + student.getRpu());
            System.out.println("7] No. of Units Enrolled: " + student.getNou());
            System.out.println("6] Tuition Fee: " + student.getTuitionFee());
            System.out.println("6] Miscellaneous Fee: " + student.getMiscFee());
            System.out.println("6] Total Fees: " + student.getTotalFees());
            System.out.println("6] Average Grade: " + student.getAvgGrd());
            System.out.println("6] Remarks: " + student.getRemarks());
            
        } catch (Exception error) {
            System.out.println("Error" + error);
        }
    }
}