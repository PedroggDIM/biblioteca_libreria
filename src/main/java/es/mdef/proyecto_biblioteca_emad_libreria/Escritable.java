package es.mdef.proyecto_biblioteca_emad_libreria;

import es.mdef.proyecto_biblioteca_emad_libreria.DocumentoImp.Categoria;

public interface Escritable {

	Categoria getCategoria();

	int getISBN();

	int getNumpaginas();

	int getTamano();

}