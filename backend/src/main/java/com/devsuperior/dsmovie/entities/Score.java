package com.devsuperior.dsmovie.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId  //Id Composto
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ScorePk id = new ScorePk();
	private Double value;
	
	public Score() {
	}

	public void setMovie(Movie movie){
		id.setMovie(movie);      }
	public void  setUser(User user){
		id.setUser(user);
	}
	/*
	public void setMovie(Movie movie) {
		id.setMovie(movie); // Associar o Filme com o Score
	}

	public void setUser(User user) {
		id.setUser(user); // Associar o Usuario com o Score
	}
	
	public ScorePk getId() {
		return id;
	}

	public void setId(ScorePk id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	*/
	
}
