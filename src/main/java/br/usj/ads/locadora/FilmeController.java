package br.usj.ads.locadora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/filme")
public class FilmeController {


    @Autowired
    FilmeRepository filmeRepository;

    @GetMapping(value="/")
    public List<Filme> getListarTodos() {
        List<Filme> lista = filmeRepository.findAll();
        return lista;
    }
    @GetMapping(value="/{id}")
    public Filme getCliente(@PathVariable Long id){
        Filme fil = filmeRepository.findById(id).get();
        return fil; 
    }
    @PostMapping(value = "/")
    public Filme postAdicionar(@RequestBody Filme filme){
       Filme filmeNovo = filmeRepository.save(filme);
       return filmeNovo;
    }
    @GetMapping(value = "/delete/{id}")
    public void getDeletar(@PathVariable Long id){
        filmeRepository.deleteById(id);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteDeletar(@PathVariable Long id){
        filmeRepository.deleteById(id);
    }
    @GetMapping(value = "pesquisa/{titulo}")
    public List<Filme> getPesquisaPorNome(@PathVariable String titulo){
        List<Filme> lista = filmeRepository.findByTituloContainingIgnoreCase(titulo);
        return lista;
    }
    
    
}
