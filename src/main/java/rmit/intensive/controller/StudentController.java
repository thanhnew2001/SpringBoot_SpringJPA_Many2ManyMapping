package rmit.intensive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.intensive.model.Student;
import rmit.intensive.service.StudentService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping(path = "/students", method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @RequestMapping(path = "/students", method = RequestMethod.POST)
    public void addStudents(@RequestBody Student student){
        this.studentService.saveStudent(student);
    }


    @RequestMapping(path = "/students/{id}", method = RequestMethod.DELETE)
    public void deleteStudents(@PathVariable int id){
        this.studentService.deleteStudent(id);
    }




}
