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
@Table(name = "Conta")
@DynamicUpdate

public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_conta")
	@Column(name = "id")
	private Integer id;
	
	@Column(name="agencia")
	private String agencia;
	
	@Column(name="banco")
	private Banco banco;	
	
	@Column(name="saldo")
	private Double saldo=0.0;
	
	@Column(name="tipoConta")
	private String tipoConta;
	
	@Column(name="status", length = 10)
	private boolean status;
	
	public Conta() {
	}
		
	public Conta(Integer id, String agencia, Banco banco, Double saldo, String tipoConta, boolean status) {
		this.id = id;
		this.agencia = agencia;
		this.banco = banco;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public String getAgencia() {
		return agencia;
	}
	public Banco getBanco() {
		return banco;
	}
	public Double getSaldo() {
		return saldo;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public boolean isStatus() {
		return status;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public void setStatus(boolean status) {
		this.status = status;
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
		Conta other = (Conta) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", agencia=" + agencia + ", banco=" + banco + ", saldo=" + saldo + ", tipoConta="
				+ tipoConta + ", status=" + status + "]";
	}	
	
	
}