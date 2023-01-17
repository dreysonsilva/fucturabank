package br.com.fucturabank.entities;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Transancao")
public class Transacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_transacao")
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataMovimentacao", nullable = false)
	private Calendar dataMovimentacao;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Conta.class, mappedBy="conta")
	@JoinColumn(name = "id", nullable = false, referencedColumnName = "id")
	private Conta conta;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Cliente.class, mappedBy="cliente")
	@JoinColumn(name = "id_cliente", nullable = false, referencedColumnName = "id")
	private Cliente usuario;

	public Integer getId() {
		return id;
	}

	public Calendar getDataMovimentacao() {
		return dataMovimentacao;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDataMovimentacao(Calendar dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}


	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
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
		Transacao other = (Transacao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Transacao [id=" + id + ", dataMovimentacao=" + dataMovimentacao + ", conta=" + conta + ", usuario="
				+ usuario + "]";
	}

}