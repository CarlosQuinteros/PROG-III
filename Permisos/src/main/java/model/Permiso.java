package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the permiso database table.
 * 
 */
@Entity
@NamedQuery(name="Permiso.findAll", query="SELECT p FROM Permiso p")
public class Permiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idpermiso;

	//bi-directional many-to-one association to Accion
	@ManyToOne
	private Accion accion;

	//bi-directional many-to-one association to Entidad
	@ManyToOne
	private Entidad entidad;

	//bi-directional many-to-many association to Rol
	@ManyToMany(mappedBy="permisos")
	private List<Rol> roles;

	public Permiso() {
	}

	public Integer getIdpermiso() {
		return this.idpermiso;
	}

	public void setIdpermiso(Integer idpermiso) {
		this.idpermiso = idpermiso;
	}

	public Accion getAccion() {
		return this.accion;
	}

	public void setAccion(Accion accion) {
		this.accion = accion;
	}

	public Entidad getEntidad() {
		return this.entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public List<Rol> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}