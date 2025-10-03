package br.com.alura.AluraFake.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.alura.AluraFake.dtos.CourseListItemDTO;
import br.com.alura.AluraFake.dtos.InstructorReportDTO;
import br.com.alura.AluraFake.services.InstructorService;

import java.util.List;

import org.hibernate.collection.spi.PersistentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class InstructorController {
    

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/instructor/{id}/courses")
    public List<InstructorReportDTO> generateInstructorReport(@PathVariable Long id) {
        return null;
        
        
    }
    


}
