package com.github.izhangzhihao.SSMSeedProject.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("Student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private Integer studId;
    private String name;
    private String email;
    private Date dob;
    //private Address address;
    public Student(String name,String email){
        this.name=name;
        this.email=email;
    }
}