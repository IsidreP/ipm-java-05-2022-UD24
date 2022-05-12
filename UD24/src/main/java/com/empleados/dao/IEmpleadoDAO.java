package com.empleados.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.empleados.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar clientes or campo nombre
	public List<Empleado> findByNombre(String nombre);

}
