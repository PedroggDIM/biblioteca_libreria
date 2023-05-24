package es.mdef.proyecto_biblioteca_emad_libreria;

import java.util.Date;

public class PrestamoImp implements Prestamo {	
	//Cada préstamo tiene un documento.
	private Documento documento;	
	
	private int idUsuario;	

	private Date fechaInicio;
	private Date fechaFin;
	
	//Getter y Setter
	
	@Override
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	@Override
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}	
	
	@Override
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	@Override
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}	

}
