package com.springcore.stereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

//stereotype annotation
@Component      //@component("") in double cot we can change the name of the bean that is Student now. but it needs p schema is config file.
@Scope("prototype")
public class Student {
    @Value("Arun Pandey")
    private String studentName;
    @Value("New Delhi")
    private String city;
    @Value("#{temp}")
    private List<String> address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
