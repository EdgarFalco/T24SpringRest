package main.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado, Integer>{	
	
	public List<Empleado> findByNombre(String nombre);
	public List<Empleado> findByTrabajo(String trabajo); 

}
