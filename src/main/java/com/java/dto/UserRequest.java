package com.java.dto;

import jakarta.validation.constraints.*;

public class UserRequest {

    @NotBlank(message = "first name shouldn't be empty")
    private String firstName;
    @NotBlank(message = "last name shouldn't be empty")
    private String lastName;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "invalid email")
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile")
    private String mobile;
    @Min(18)
    @Max(75)
    private int age;
    private String gender;
    @NotBlank(message = "nationality shouldn't be empty")
    private String nationality;

    public UserRequest() {
    }

    public UserRequest(String firstName, String lastName, String email, String mobile, int age, String gender, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
