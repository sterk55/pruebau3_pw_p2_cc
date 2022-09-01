package com.example.demo.uce.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.repository.modelo.Paciente;
import com.example.demo.uce.service.IDoctorService;
import com.example.demo.uce.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteRestFulController {
    
    @Autowired
    private IPacienteService pacienteService;
    
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public String crear(@RequestBody Paciente paciente){

        String mensaje = "Se ha insertado correctamente";
        try{
            this.pacienteService.crear(paciente);

        }catch(Exception e){
            mensaje = "Error al guardar";
        }

        return mensaje;
        
    }


    
}
