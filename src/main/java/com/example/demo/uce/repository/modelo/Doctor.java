package com.example.demo.uce.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "doctor")
public class Doctor {
    
    @Id
	@Column(name = "doct_id")
	private Integer id;

    @Column(name = "doct_cedula")
	private Integer cedula;

    @Column(name = "doct_nombre")
	private String nombre;
	
	@Column(name = "doct_apellido")
	private String apellido;
	
	@Column(name = "doct_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;

    @Column(name = "doct_numero_consultorio")
	private Integer numeroConsultorio;

    @Column(name = "doct_codigo_senescyt")
	private Integer codigoSenescyt;

    @Column(name = "doct_genero")
	private String genero;

    @OneToMany(mappedBy = "doctor")
    private List<cita_medica> citasMedicas;


    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(Integer numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public Integer getCodigoSenescyt() {
        return codigoSenescyt;
    }

    public void setCodigoSenescyt(Integer codigoSenescyt) {
        this.codigoSenescyt = codigoSenescyt;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }




    

}
