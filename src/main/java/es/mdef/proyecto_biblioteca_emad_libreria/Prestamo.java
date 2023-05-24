package es.mdef.proyecto_biblioteca_emad_libreria;

import java.util.Date;

public interface Prestamo {

	Documento getDocumento();

	int getIdUsuario();

	Date getFechaInicio();

	Date getFechaFin();

}