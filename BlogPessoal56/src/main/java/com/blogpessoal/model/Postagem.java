package com.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table( name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long ID;
	
	@NotBlank(message = "O atributo titulo é Obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 10 caracteres e no maximo 1000")
	private String titulo;
	
	@NotBlank(message = "O atributo texto é Obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 10 caracteres e no maximo 1000")
	private String texto;

	@UpdateTimestamp
	private LocalDateTime data;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
