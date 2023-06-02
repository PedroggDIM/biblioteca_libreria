package es.mdef.proyecto_biblioteca_emad_libreria;

import es.mdef.proyecto_biblioteca_emad_libreria.DocumentoImp.Categoria;

public class EscritoImp extends DocumentoImp implements Escritable{

	private int ISBN;
	private int numpaginas;
	private int tamano;
	
	
	
	@Override
	public Categoria getCategoria() {		
		return super.getCategoria();
	}
	@Override
	public void setCategoria(Categoria categoria) {
		super.setCategoria(categoria);
	}
	@Override
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	@Override
	public int getNumpaginas() {
		return numpaginas;
	}
	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}
	@Override
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

}
