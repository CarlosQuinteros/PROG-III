package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the entidad database table.
 * 
 */
@Entity
@NamedQuery(name="Entidad.findAll", query="SELECT e FROM Entidad e")
public class Entidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nombre;

	//bi-directional many-to-one association to Permiso
	@OneToMany(mappedBy="entidad")
	private List<Permiso> permisos;

	public Entidad() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Permiso> getPermisos() {
		return this.permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public Permiso addPermiso(Permiso permiso) {
		getPermisos().add(permiso);
		permiso.setEntidad(this);

		return permiso;
	}

	public Permiso removePermiso(Permiso permiso) {
		getPermisos().remove(permiso);
		permiso.setEntidad(null);

		return permiso;
	}

}