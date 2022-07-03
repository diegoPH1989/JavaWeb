package Repositorio;

import org.springframework.data.repository.Repository;

import Modelo.clientesModelo;
import java.util.List;

public interface clientesRepositorio extends Repository<clientesModelo, Integer> {

	public void save(clientesModelo cliente);

	List<clientesModelo> findAll();

	clientesModelo findByID(Integer id);

	void delete(clientesModelo cliente);

}
