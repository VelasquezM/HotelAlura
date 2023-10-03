package Controladores;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import CRUD.ReservaCRUD;
import Factory.ConexionBase;
import modelo.Reserva;

public class ReservaControlador {
	
	private ReservaCRUD reservaC;

	public ReservaControlador() {
		Connection con = new ConexionBase().conectarBase();
		this.reservaC = new ReservaCRUD(con);
	}
	
	public void guardar (Reserva reserva) {
		this.reservaC.guardar(reserva);
	}
	
	public List<Reserva> mostrar(){
		return this.reservaC.mostrar();
	}
	public List<Reserva> buscar(String id){
		return this.reservaC.buscarId(id);
	}
	
	public void actualizarReserva(LocalDate dataE, LocalDate dataS, String valor, String formaPago, Integer id) {
		this.reservaC.Actualizar(dataE, dataS, valor, formaPago, id);
	}
	
	public void Eliminar(Integer id) {
		this.reservaC.Eliminar(id);
	}

}
