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
@Table(name = "Cliente")
@DynamicUpdate
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_cliente")
	@Column(name = "id",nullable = false)
	private Integer id;

	@Column(name = "nome", nullable = false, length = 50)
	private String nome;

	@Column(name = "cpf", nullable = false, length = 12)
	private String cpf;

	@Column(name = "endereco", nullable = false)
	private String endereco;

	@Column(name = "contato", nullable = false,  length = 11)
	private String contato;

	@Column(name = "usuario",  nullable = false)
	private String usuario;

	@Column(name = "senha", nullable = false)
	private String senha;

	public Integer getId() {
		return id;
	}

	public Cliente() {
	}

	public Cliente(Integer id, String nome, String cpf, String endereco, String contato, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.contato = contato;
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getContato() {
		return contato;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", contato="
				+ contato + ", usuario=" + usuario + ", senha=" + senha + "]";
	}

}