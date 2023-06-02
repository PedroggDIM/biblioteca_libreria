package es.mdef.proyecto_biblioteca_emad_libreria;

import es.mdef.proyecto_biblioteca_emad_libreria.DocumentoImp.Categoria;

public class AudiovisualImp extends DocumentoImp implements Audiovisuable{

	private int ISAN;
    private int duracion;
    private String tipo;
    
	@Override
	public int getISAN() {
		return ISAN;
	}
	public void setISAN(int iSAN) {
		ISAN = iSAN;
	}
	@Override
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}    
    
}
