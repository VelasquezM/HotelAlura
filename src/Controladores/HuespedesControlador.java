package Controladores;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import CRUD.HuespedesCRUD;
import Factory.ConexionBase;
import modelo.Huespedes;

public class HuespedesControlador {
	
	private HuespedesCRUD huespedesCrud;
	
	public HuespedesControlador() {
		Connection con = new ConexionBase().conectarBase();
		this.huespedesCrud = new HuespedesCRUD(con);
		
	}
	
	public void guardar(Huespedes huespedes) {
		this.huespedesCrud.guardar(huespedes);
	}

	public List<Huespedes> mostrarHuesped() {
		return this.huespedesCrud.mostrar();
	}
	
	public List<Huespedes> buscarHuesped(String id) {
		return this.huespedesCrud.buscarId(id);
	}
	
	public void actualizarH(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String telefono,
			Integer idReserva, Integer id) {
		this.huespedesCrud.ActualizarH(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReserva, id);
	}
	
	public void Eliminar(Integer idReserva) {
		this.huespedesCrud.Eliminar(idReserva);
	}
	
}
