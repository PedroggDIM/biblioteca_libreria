package es.mdef.proyecto_biblioteca_emad_libreria;

import java.util.Date;
import java.util.List;

public class DocumentoImp implements Documento {
	
	private Long id;
	private String titulo;
	private String autor;
	private String sinopsis;
	private int estanteria;
	private Date fechaAlta;
	private boolean disponible;
	
	public static enum Categoria {
		escrito, audiovisual
	}
	
	@Override
	public Categoria getCategoria() {
		return null;
	}
	public Categoria setCategoria() {		
		return null;
	}


	List<Prestamo> prestamos;

	@Override
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	// Getters y Setters de la clase
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	@Override
	public int getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(int estanteria) {
		this.estanteria = estanteria;
	}

	@Override
	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}	

}
