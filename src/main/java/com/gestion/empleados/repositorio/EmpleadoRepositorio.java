/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestion.empleados.repositorio;

import com.gestion.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bajaña
 */

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{
    
}
