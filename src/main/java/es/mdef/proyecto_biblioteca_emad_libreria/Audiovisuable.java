package es.mdef.proyecto_biblioteca_emad_libreria;

import es.mdef.proyecto_biblioteca_emad_libreria.DocumentoImp.Categoria;

public interface Audiovisuable {

	Categoria getCategoria();

	int getISAN();

	int getDuracion();

	String getTipo();

}