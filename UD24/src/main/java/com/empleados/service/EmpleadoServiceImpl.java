package com.empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.dao.IEmpleadoDAO;
import com.empleados.dto.Empleado;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}


	@Override
	public List<Empleado> listarEmpleadoNomnbre(String nombre) {
		
		return iEmpleadoDAO.findByNombre(nombre);
	}
	
}
