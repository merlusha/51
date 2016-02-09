package org.zhudro.fiftyone;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by mikalai on 08.02.16.
 */
public class InputValidator {
    public static void main(String[] args) {
        Employee e = getEmployee();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Employee>> violations=validator.validate(e);
        if(!violations.isEmpty()){
            for (ConstraintViolation v:violations){
                System.out.println(v.getPropertyPath()+" is not valid because "+v.getMessage());
            }
        }

       // System.out.print(validateInput(firstName, lastName, zipCode, id));
    }

    public static  Employee getEmployee(){
        Employee e = new Employee();
        e.setFirstName("qa");
        e.setLastName("asds");
        e.setZipCode("123");
        e.setId("AA-1234");
        return e;
    }

    public static Employee getEmployeeFromCommandLine(){

        Employee e = new Employee();

        System.out.print("Enter the first name: ");
        e.setFirstName(System.console().readLine());

        System.out.print("Enter the last name: ");
        e.setLastName(System.console().readLine());

        System.out.print("Enter the ZIP code: ");
        e.setZipCode(System.console().readLine());

        System.out.print("Enter the employee ID: ");
        e.setId(System.console().readLine());
        return e;
    }

    static String validateInput(String firstName,String lastName,String zipCode,String id){
        StringBuilder sb = new StringBuilder();

        if(firstName==null || firstName.isEmpty()){
            sb.append("The first name should be filled in.\n");
        }
        if(firstName.length()<=2){
            sb.append(firstName+" is not valid first name. It is too short\n");
        }

        if(lastName==null || lastName.isEmpty()){
            sb.append("The  last name should be filled in.\n");
        }
        if(lastName.length()<=2){
            sb.append(lastName+" is not valid last name name. It is too short\n");
        }

        if(zipCode==null || zipCode.isEmpty()){
            sb.append("The zip code must be filled in");
        }

        if(!isNumber(zipCode)){
            sb.append("The zip code must be numeric");
        }
        if(id==null || id.isEmpty()){
            sb.append("The id should be filled in.\n");
        }

        if(!isValid(id)){
            sb.append(id+" is not valid ID");
        }

        if(sb.length()>0){
            return sb.toString();
        }

        return "There were no errors found";
    }

    private  static boolean isNumber(String s){
        for (char c:s.toCharArray()) {
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    private static boolean isValid(String id){
        if(id.length()!=7){
            return false;
        }
        if(!Character.isLetter(id.charAt(0)) || !Character.isLetter(id.charAt(1))){
            return false;
        }
        if(id.charAt(2)!='c'){
            return false;
        }
        if(isNumber(id.substring(4))){
            return false;
        }
        return true;
    }
}

