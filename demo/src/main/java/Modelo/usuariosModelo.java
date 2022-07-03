package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "usuarios")
@Entity
public class usuariosModelo {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer id_usuario;
	
	@Column(name="nome_usuario")
	private String nome_usuario;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="nivel_acesso")
	private Integer nivel_acesso;
	
	

	public Integer getId() {
		return id_usuario;
	}

	public void setId(Integer id) {
		this.id_usuario = id;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getNivel_acesso() {
		return nivel_acesso;
	}

	public void setNivel_acesso(Integer nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}
}
	
	