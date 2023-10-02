/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Paulo
 */
public class Student3 extends Person3 {

    private int year;
    private String degree;
    private String section;
    private int nou;
    private double prelimGrd;
    private double midtermGrd;
    private double finalGrd;

//    private double rpu;
//    private double tuitionFee;
//    private double miscFee;
//    private double totalFees;
//    private double avgGrd;
//    private String remarks;
//    private String sex;

    public Student3(
            String firstName,
            String lastName,
            char sexCode,
            int year,
            String degree,
            String section,
            int nou,
            double prelimGrd,
            double midtermGrd,
            double finalGrd) {
        super(firstName, lastName, sexCode);
        
        this.year = year;
        this.degree = degree;
        this.section = section;
        this.nou = nou;
        this.prelimGrd = prelimGrd;
        this.midtermGrd = midtermGrd;
        this.finalGrd = finalGrd;
    }
    
        public int getYear() {
        return year;
    }

    public String getDegree() {
        return degree;
    }

    public String getSection() {
        return section;
    }

    public int getNou() {
        return nou;
    }

    public double getPrelimGrd() {
        return prelimGrd;
    }

    public double getMidtermGrd() {
        return midtermGrd;
    }

    public double getFinalGrd() {
        return finalGrd;
    }

    public double getRpu() {
        if (this.year == 1) return 650;
        if (this.year == 2) return 600;
        if (this.year == 3) return 550;
        if (this.year == 4) return 500;
        throw new Error("Year is invalid");
    }

    public double getTuitionFee() {
        return this.nou * getRpu();
    }

    public double getMiscFee() {
        if (this.year == 1) return getTuitionFee() * .10;
        if (this.year == 2) return getTuitionFee() * .15;
        if (this.year == 3) return getTuitionFee() * .20;
        if (this.year == 4) return getTuitionFee() * .25;
        throw new Error("Year is invalid");
    }

    public double getTotalFees() {
        return getTuitionFee() + getMiscFee();
    }

    public double getAvgGrd() {
        return (this.prelimGrd + this.midtermGrd + this.finalGrd)/3;
    }

    public String getRemarks() {
        if (getAvgGrd() < 74.5) return "Failed";
        if (getAvgGrd() < 86.99) return "Passed";
        if (getAvgGrd() < 90.99) return "With Honors";
        if (getAvgGrd() < 95.99) return "With High Honors";
        if (getAvgGrd() < 100) return "With Highest Honors";
        
        return "Invalid Grade";
    }

    public String getSex() {
        return (getSexCode() == 'M') ? "Male" : "Female";
    }
}
