package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idusuario;

	private String apellidonombre;

	private String email;

	private String legajo;

	private String login;

	//bi-directional many-to-many association to Rol
	@ManyToMany
	@JoinTable(
		name="relacion_usuario_rol"
		, joinColumns={
			@JoinColumn(name="idusuario")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idrol")
			}
		)
	private List<Rol> roles;

	public Usuario() {
	}

	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getApellidonombre() {
		return this.apellidonombre;
	}

	public void setApellidonombre(String apellidonombre) {
		this.apellidonombre = apellidonombre;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLegajo() {
		return this.legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Rol> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}