package com.github.izhangzhihao.SSMSeedProject.Test.ServiceTest;

import com.github.izhangzhihao.SSMSeedProject.Config.Application;
import com.github.izhangzhihao.SSMSeedProject.Config.MyBatisConfig;
import com.github.izhangzhihao.SSMSeedProject.Config.MyBatisMapperScannerConfig;
import com.github.izhangzhihao.SSMSeedProject.Model.Student;
import com.github.izhangzhihao.SSMSeedProject.Service.StudentService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {
        Application.class, MyBatisConfig.class, MyBatisMapperScannerConfig.class
})
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class
})
public class StudentServiceTest
{
    private static StudentService studentService;
    @BeforeClass
    public static void setup()
    {
        studentService = new StudentService();
    }
    @Test
    public void testFindAllStudents()
    {
        List<Student> students = studentService.findAllStudents();
        Assert.assertNotNull(students);
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
    @Test
    public void testFindStudentById()
    {
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        System.out.println(student);
    }
    @Test
    public void testCreateStudent()
    {
        Student student = new Student();
        int id = 3;
        student.setStudId(id);
        student.setName("student_" + id);
        student.setEmail("student_" + id + "gmail.com");
        student.setDob(new Date());
        studentService.createStudent(student);
        Student newStudent = studentService.findStudentById(id);
        Assert.assertNotNull(newStudent);
    }
}
