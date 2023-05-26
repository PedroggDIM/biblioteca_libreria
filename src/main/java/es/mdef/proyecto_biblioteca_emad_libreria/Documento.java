package es.mdef.proyecto_biblioteca_emad_libreria;

import java.util.Date;
import java.util.List;

import es.mdef.proyecto_biblioteca_emad_libreria.DocumentoImp.Categoria;

public interface Documento {

	Categoria getCategoria();
    //Un documento tiene muchos préstamos
	List<Prestamo> getPrestamos();

	// Getters y Setters de la clase
	

	String getTitulo();

	String getAutor();

	String getSinopsis();

	int getEstanteria();

	Date getFechaAlta();

	boolean isDisponible();
	
	int getNumCopias();

}