package br.usj.ads.locadora;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface FilmeRepository extends CrudRepository<Filme, Long>{
    List<Filme> findAll();
    List<Filme> findByTituloContainingIgnoreCase(String titulo);

}