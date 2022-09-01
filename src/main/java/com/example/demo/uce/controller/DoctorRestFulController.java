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
import com.example.demo.uce.service.IDoctorService;

@RestController
@RequestMapping("/doctores")
public class DoctorRestFulController {
    
    @Autowired
    private IDoctorService doctorService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public String crear(@RequestBody Doctor doctor){

        String mensaje = "Se ha insertado correctamente";
        try{
            this.doctorService.crear(doctor);

        }catch(Exception e){
            mensaje = "Error al guardar";
        }

        return mensaje;
        
    }

    @PutMapping
    public String actualizar(@RequestBody Doctor doctor){
        this.doctorService.actualizar(doctor);
        return "Se ha actualizado";

    }

    @GetMapping(path = "/{idDoctor}", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Doctor> buscarDoctor(@PathVariable("idDoctor") Integer id){

        Doctor doc = this.doctorService.buscar(id);
        return ResponseEntity.ok(doc);
        
    }
    
    @DeleteMapping(path = "/{idDoctor}")
    public String eliminar(@PathVariable("idDoctor") Integer id) {
        this.doctorService.eliminar(id);
        return "Eliminado Correcto";
    }

}
