package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
	// Cria os atributos da classe "Game"
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	// Cria o método construtor (sem parâmetros)
	public GameMinDTO() {
	}
	// Cria o método construtor (com parâmetros)
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	// Cria os getters e setters
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
}
