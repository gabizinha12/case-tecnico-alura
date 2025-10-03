package br.com.alura.AluraFake.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.AluraFake.dtos.InstructorReportDTO;
import br.com.alura.AluraFake.repositories.InstructorRepository;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;



    private List<InstructorReportDTO> generateInstructorReport() {
        return null;
        
    }
    
}
