package br.usj.ads.locadora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@ResponseBody
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping(value="/")
    public List<Cliente> getListarTodos() {
        List<Cliente> lista = clienteRepository.findAll();
        return lista;
    }
    @GetMapping(value="/{id}")
    public Cliente getCliente(@PathVariable Long id){
        Cliente cli = clienteRepository.findById(id).get();
        return cli; 
    }
    @PostMapping(value = "/")
    public Cliente postAdicionar(@RequestBody Cliente cliente){
        ;
       return clienteRepository.save(cliente);
    }
    @GetMapping(value = "/delete/{id}")
    public void getDeletar(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteDeletar(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }
    @GetMapping(value = "pesquisa/{nome}")
    public List<Cliente> getPesquisaPorNome(@PathVariable String nome){
        List<Cliente> lista = clienteRepository.findByNomeContainingIgnoreCase(nome);
        return lista;
    }

}
