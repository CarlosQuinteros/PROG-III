package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the nicer_but_slower_film_list database table.
 * 
 */
@Entity
@Table(name="nicer_but_slower_film_list")
@NamedQuery(name="NicerButSlowerFilmList.findAll", query="SELECT n FROM NicerButSlowerFilmList n")
public class NicerButSlowerFilmList implements Serializable {
	private static final long serialVersionUID = 1L;

	private String actors;

	private String category;

	private String description;

	private Integer fid;

	private Integer length;

	private BigDecimal price;

	private String rating;

	private String title;

	public NicerButSlowerFilmList() {
	}

	public String getActors() {
		return this.actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Integer getLength() {
		return this.length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}