/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Paulo
 */
public class Person3 {
    
    private String firstName;
    private String lastName;
    private char sexCode;
    
// Constructor
    public Person3(String firstName, String lastName, char sexCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sexCode = sexCode;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }

    public char getSexCode() {
        return sexCode;
    }
    
}
