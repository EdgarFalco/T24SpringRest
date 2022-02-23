package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IEmpleadoDAO;
import main.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {
		
		return iEmpleadoDAO.findByNombre(nombre);
	}
	
	@Override
    public List<Empleado> listarEmpleadoTrabajo(String trabajo){

        return iEmpleadoDAO.findByTrabajo(trabajo);
    }

	@Override
	public Empleado empleadoXID(Integer id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Integer id) {
		
		iEmpleadoDAO.deleteById(id);
	}	
	
}
