package rmit.intensive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rmit.intensive.model.Student;
import rmit.intensive.store.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student){

        this.studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return this.studentRepository.findAll();
    }

    public void deleteStudent(int id){
        Student student = studentRepository.getOne(id);
        studentRepository.delete(student);

    }


}
