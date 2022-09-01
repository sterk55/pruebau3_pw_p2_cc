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
import com.example.demo.uce.repository.modelo.cita_medica;
import com.example.demo.uce.service.ICitaMedicaService;
import com.example.demo.uce.service.IDoctorService;

@RestController
@RequestMapping("/citasMedicas")
public class CitaMediaRestFulController {
    @Autowired
    private ICitaMedicaService citaMedicaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public String crear(@RequestBody cita_medica cita_medica){

        String mensaje = "Se ha insertado correctamente";
        try{
            this.citaMedicaService.crear(cita_medica);

        }catch(Exception e){
            mensaje = "Error al guardar";
        }

        return mensaje;
        
    }

    @PutMapping
    public String actualizar(@RequestBody cita_medica cita_medica){
        this.citaMedicaService.actualizar(cita_medica);
        return "Se ha actualizado";

    }


}
