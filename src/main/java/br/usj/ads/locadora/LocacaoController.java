package br.usj.ads.locadora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/locacao")
public class LocacaoController {
    
    @Autowired
    LocacaoRepository locacaoRepository;

    @GetMapping(value="/")
    public List<Locacao> getListarTodos() {
        List<Locacao> lista = locacaoRepository.findAll();
        return lista;
    }

    @GetMapping(value="/{id}")
    public Locacao getLocacao(@PathVariable Long id){
        Locacao loc = locacaoRepository.findById(id).get();
        return loc; 
    }

    @PostMapping(value = "/")
    public Locacao postAdicionar(@RequestBody Locacao locacao){
       Locacao locNovo = locacaoRepository.save(locacao);
       return locNovo;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteDeletar(@PathVariable Long id){
        locacaoRepository.deleteById(id);
    }



}
