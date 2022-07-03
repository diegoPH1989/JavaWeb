package Repositorio;

import org.springframework.data.repository.Repository;

import Modelo.vendasModelo;

import java.util.List;

public interface vendasRepositorio extends Repository<vendasModelo, Integer> {

	public void save(vendasModelo vendas);

	List<vendasModelo> findAll();

	vendasModelo findByID(Integer id);

	void delete(vendasModelo vendas);

}
