package es.open4job.web.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String descripcion;

	//
	// Getters and setters
	//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	//
	// Metodos
	//

	public String saludar() {

		if ((nombre == null) || (nombre.equals("")))
			return "";
		else
			return "Hola " + nombre + " (Respuesta Ajax).";

	}
}
