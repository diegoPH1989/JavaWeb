package Repositorio;

import org.springframework.data.repository.Repository;

import Modelo.usuariosModelo;

import java.util.List;

public interface usuariosRepositorio extends Repository<usuariosModelo, Integer> {

	public void save(usuariosModelo usuarios);

	List<usuariosModelo> findAll();

	usuariosModelo findByID(Integer id);

	void delete(usuariosModelo usuarios);

}
