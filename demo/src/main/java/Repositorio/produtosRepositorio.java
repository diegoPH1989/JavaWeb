package Repositorio;

import org.springframework.data.repository.Repository;

import Modelo.produtModelo;

import java.util.List;

public interface produtosRepositorio extends Repository<produtModelo, Integer> {

	public void save(produtModelo produtos);

	List<produtModelo> findAll();

	produtModelo findByID(Integer id);

	void delete(produtModelo produtos);

}
