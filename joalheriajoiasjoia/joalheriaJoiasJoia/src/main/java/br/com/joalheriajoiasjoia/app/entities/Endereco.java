package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
//Atributos
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idEndereco", nullable = false)
private Long idEndereco;

@Column(name = "cep", nullable = false, length = 8)
private String cep;

@Column(name = "estado", nullable = false, length = 2)
private String estado;

@Column(name = "cidade", nullable = false, length = 50)
private String cidade;

@Column(name = "numeroCasa", nullable = false, length = 4)
private String numero;

@Column(name = "rua", nullable = false, length = 100)
private String rua;

@Column(name = "complemento", nullable = false, length = 100)
private String complemento;

@Column(name = "bairro", nullable = false, length = 100)
private String bairro;

//Construtores
public Endereco(Long idEndereco, String cep, String estado, String cidade, String numero, String rua, String complemento, String bairro) {
	this.idEndereco = idEndereco;
	this.cep = cep;
	this.estado = estado;
	this.cidade = cidade;
	this.numero = numero;
	this.rua = rua;
	this.complemento = complemento;
	this.bairro = bairro;
}

public Long getIdEndereco() {
	return idEndereco;
}

public void setIdEndereco(Long idEndereco) {
	this.idEndereco = idEndereco;
}

public String getCep() {
	return cep;
}

public void setCep(String cep) {
	this.cep = cep;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public String getRua() {
	return rua;
}

public void setRua(String rua) {
	this.rua = rua;
}

public String getComplemento() {
	return complemento;
}

public void setComplemento(String complemento) {
	this.complemento = complemento;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

}