package com.example.User.Service.UserValidator;

import com.example.User.Service.Entity.User;

public class UserValidator {
    
    public static boolean validateUser(User user){

        // check if any of the value of the attribute of user is null 
        return validateName(user.getName()) && validateName(user.getLastName()) && validatePhoneNumber(user.getMobile()) && validateEmail(user.getEmail());
    }

    // function to validate name
    public static boolean validateName(String name){
        if(name==null || name==" "){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(!(name.charAt(i)>=65 && name.charAt(i)<=90) || !(name.charAt(i)>=97 && name.charAt(i)<=122) ){
                return false;
            }
        }
        return true;
    }

    // function to validate Phone Number
    public static boolean validatePhoneNumber(String number){
        if(number==null || number==" "){
            return false;
        }
        if(number.length()!=10) return false;
        for(int i=0;i<number.length();i++){
            char ch=number.charAt(i);
            if(!Character.isDigit(ch)) return false;
        }
        return true;
    }

    // function to validate if email id is valid or not
    public static boolean validateEmail(String email) {
        if(email==null || email==" ") return false;
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
     }
}
