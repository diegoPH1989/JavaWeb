package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "produtos")
@Entity
public class produtModelo {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_produtos")
	private Integer id_produtos;
	
	@Column(name="descriçao_produto")
	private String descriçao_produto;
	
	@Column(name="quantidade_estoque")
	private Integer quantidade_estoque;
	
	@Column(name="valor")
	private float valor;

	public Integer getId() {
		return id_produtos;
	}

	public void setId(Integer id) {
		this.id_produtos = id;
	}

	public String getDescriçao_produto() {
		return descriçao_produto;
	}

	public void setDescriçao_produto(String descriçao_produto) {
		this.descriçao_produto = descriçao_produto;
	}

	public Integer getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(Integer quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}



}
