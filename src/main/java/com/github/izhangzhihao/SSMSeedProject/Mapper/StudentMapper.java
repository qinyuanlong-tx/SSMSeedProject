package com.github.izhangzhihao.SSMSeedProject.Mapper;

import com.github.izhangzhihao.SSMSeedProject.Model.Student;
import com.github.izhangzhihao.SSMSeedProject.Utils.BaseMapper;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {
    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudent(Student student);
}
