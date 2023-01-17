package br.com.fucturabank.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Banco")
@DynamicUpdate
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_banco")
	@Column(name = "id",nullable = false)
	private Integer id;
	
	@Column(name="descricao")
	private String descricao;
	
	public Banco() {
	}
	
	public Banco(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	public Integer getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Banco [id=" + id + ", descricao=" + descricao + "]";
	}
}