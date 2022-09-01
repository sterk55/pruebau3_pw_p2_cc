package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository{

    @PersistenceContext
	private EntityManager entityManager;
	

    @Override
    public void crear(Doctor doctor) {
        this.entityManager.persist(doctor);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void actualizar(Doctor doctor) {
        this.entityManager.merge(doctor);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void eliminar(Integer id) {
        this.entityManager.remove(this.buscar(id));
        // TODO Auto-generated method stub
        
    }

    @Override
    public Doctor buscar(Integer id) {
        // TODO Auto-generated method stub
        return this.entityManager.find(Doctor.class, id);
    }
    
}
