/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Khairul Hakimi
 */
public class RegisterMyAccount { // to register information
    private String name;
    private String username;
    private String password;
    private String phoneNumber;

    public String getName() { //to get name 
        return name;
    }

    public void setName(String name) {// to set name
        this.name = name;
    }
    
    public String getUsername() {// to get matric no
        return username;
    }

    public void setUsername(String username) {// to set matric no
        this.username = username;
    }

    public String getPassword() {// to get password
        return password;
    }

    public void setPassword(String password) { //to set password
        this.password = password;
    }
    
    public String getPhoneNumber() { //to get phone number
            return phoneNumber;
        }

    public void setPhoneNumber(String phoneNumber) { //to set phone number
            this.phoneNumber = phoneNumber;
        }   

}
