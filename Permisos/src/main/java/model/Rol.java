package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idrol;

	private String nombre;

	//bi-directional many-to-many association to Permiso
	@ManyToMany
	@JoinTable(
		name="relacion_permiso_rol"
		, joinColumns={
			@JoinColumn(name="idrol")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idpermiso")
			}
		)
	private List<Permiso> permisos;

	//bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy="roles")
	private List<Usuario> usuarios;

	public Rol() {
	}

	public Integer getIdrol() {
		return this.idrol;
	}

	public void setIdrol(Integer idrol) {
		this.idrol = idrol;
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

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}