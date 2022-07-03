package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "clientes")
@Entity
public class clientesModelo {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clientes")
	private Integer id_clientes;

	@Column(name = "nome_cliente")
	private String nome_cliente;

	@Column(name = "CPF")
	private String CPF;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "email")
	private String email;

	public Integer getId() {
		return id_clientes;
	}

	public void setId(Integer id) {
		this.id_clientes = id;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
