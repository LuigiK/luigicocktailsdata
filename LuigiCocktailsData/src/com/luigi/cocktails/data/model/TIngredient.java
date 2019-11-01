package com.luigi.cocktails.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_ingredients", schema = "co")
public class TIngredient implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_ingredients_seq")
    @SequenceGenerator(name = "t_ingredients_seq", sequenceName = "co.t_ingredients_ingredient_id_seq", allocationSize = 1, initialValue = 0)
	@Column(name = "ingredient_id", nullable = false)
	private Long ingredientId;

	@Column(name = "name", nullable = false)
	private String name;

	public TIngredient() {
		super();
	}

	public Long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
