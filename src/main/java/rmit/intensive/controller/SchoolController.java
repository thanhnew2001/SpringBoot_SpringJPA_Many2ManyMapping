package rmit.intensive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.intensive.model.School;
import rmit.intensive.model.Student;
import rmit.intensive.store.SchoolRepository;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;


    @RequestMapping(path = "/schools", method = RequestMethod.GET)
    public List<School> getAllSchools(){
        return this.schoolRepository.findAll();
    }

    @RequestMapping(path = "/schools", method = RequestMethod.POST)
    public void addSchool(@RequestBody School school){
        this.schoolRepository.save(school);
    }


}
