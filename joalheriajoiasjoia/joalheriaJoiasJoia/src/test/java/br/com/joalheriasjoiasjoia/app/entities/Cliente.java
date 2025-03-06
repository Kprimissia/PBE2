package br.com.joalheriasjoiasjoia.app.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_cliente")
public class Cliente {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_cliente", nullable = false)
	
	private Long id_cliente;
	
	@Column(name = "nome_cliente", nullable = false, length = 100) 
	
	private String nome_cliente;
	
	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	
	private String cpf;
	
	@Column(name = "email", nullable = false, length = 50)
	
	private String email;
	
	@Column(name = "telefone", nullable = false, length = 11, unique = false)
	
	private String telefone;
	
	@Column (name = "dt_Nascimento, nullable = false, length = 8", unique = false)
	private Date dt_Nascimento;
	
	//Construtores
	public Cliente() {
		
	}
	public Cliente (Long id_cliente, String nome_cliente, String cpf, String email, String telefone, Date dt_nascimentp) {
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dt_Nascimento = dt_Nascimento;
	}
	
	//Getters e Setters
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getCpf(String cpf) {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail(String email) {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDt_Nascimento() {
		return dt_Nascimento;
	}
	public void setDt_Nascimento(Date dt_Nascimento) {
		this.dt_Nascimento = dt_Nascimento;
	}
}

