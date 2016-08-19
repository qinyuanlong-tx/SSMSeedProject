package com.github.izhangzhihao.SSMSeedProject.Mapper;

import com.github.izhangzhihao.SSMSeedProject.Model.Student;

import java.util.List;

//@Mapper 写了 @MapperScan("com.github.izhangzhihao.SSMSeedProject.Mapper") 之后就不用写了
public interface StudentMapper {

    List<Student> findAllStudents();

    Student findStudentById(int id);

    void insertStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

//    Student selectStudentWithAddress(int id);

    Student findStudentByIdWithAddress(int id);
}
