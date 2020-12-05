package br.usj.ads.locadora;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

public interface LocacaoRepository extends CrudRepository<Locacao, Long>{
    List<Locacao> findAll();
    
}
