package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Empleado;
import main.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImpl.listarEmpleados();
	}

	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarEmpleadoNombre(@PathVariable(name = "nombre") String nombre) {
		return empleadoServiceImpl.listarEmpleadoNombre(nombre);
	}	
	
    @GetMapping("/empleados/trabajo/{trabajo}")
    public List<Empleado> listarEmpleadoTrabajo(@PathVariable(name="trabajo") String trabajo) {
        return empleadoServiceImpl.listarEmpleadoTrabajo(trabajo);
    }

	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {

		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name = "id") Integer id) {

		Empleado empleado_xid = new Empleado();

		empleado_xid = empleadoServiceImpl.empleadoXID(id);

		System.out.println("Empleado x ID: " + empleado_xid);

		return empleado_xid;
	}

	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Integer id, @RequestBody Empleado empleado) {

		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();

		empleado_seleccionado = empleadoServiceImpl.empleadoXID(id);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellido(empleado.getApellido());
		empleado_seleccionado.setDireccion(empleado.getDireccion());
		empleado_seleccionado.setDni(empleado.getDni());
		empleado_seleccionado.setFecha(empleado.getFecha());

		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);

		System.out.println("El empleado actualizado es: " + empleado_actualizado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleados/{id}")
	public void eleiminarEmpleado(@PathVariable(name = "id") Integer id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
}
