package classes.user;

import exceptions.BadEmailException;
import exceptions.BadGenderException;
import exceptions.BadIDNumberException;
import exceptions.BadNameException;

public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String pinCode;
    private String idNumber; //jmbg

    public User() {
    }

    public User(String firstName, String lastName, String gender, String email, String pinCode, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.pinCode = pinCode;
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws BadNameException {
        if(firstName.trim().length() >= 3)
            this.firstName = firstName;
        else
            throw new BadNameException("First name must contain at least 3 characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws BadNameException {
        if(lastName.trim().length() >= 4)
            this.lastName = lastName;
        else
            throw new BadNameException("Last name must contain at least 4 characters");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws BadGenderException {
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
            this.gender = gender.toLowerCase();
        else
            throw new BadGenderException("Invalid input");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws BadEmailException {
        if(email.indexOf("@") > 0 && email.indexOf(".") > 0)
            this.email = email;
        else
            throw new BadEmailException("Invalid mail");
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) throws BadIDNumberException {
        if (idNumber.length() == 13 && idNumber.matches("-?\\d+(\\.\\d+)?"))
            this.idNumber = idNumber;
        else
            throw new BadIDNumberException("ID number must contain 13 digits and must be numbers");
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        if(pinCode.trim().length() == 4)
            this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Hello " + this.firstName + " " + this.lastName + "!\nWelcome to E-Banking app";
    }
}
