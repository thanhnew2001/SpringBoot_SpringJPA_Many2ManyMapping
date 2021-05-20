package rmit.intensive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rmit.intensive.model.Admission;
import rmit.intensive.model.School;
import rmit.intensive.model.Student;
import rmit.intensive.service.StudentService;
import rmit.intensive.store.AdmissionRepository;
import rmit.intensive.store.SchoolRepository;

import java.util.List;

@RestController
public class AdmissionController {

    @Autowired
    private AdmissionRepository admissionRepository;


    @RequestMapping(path = "/admissions", method = RequestMethod.GET)
    public List<Admission> getAllAdmissions(){
        return this.admissionRepository.findAll();
    }

    @RequestMapping(path = "/admissions", method = RequestMethod.POST)
    public void addAdmission(@RequestBody Admission admission){
        this.admissionRepository.save(admission);
    }



}
