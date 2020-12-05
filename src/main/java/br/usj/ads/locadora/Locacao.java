package br.usj.ads.locadora;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Date data_aluguel;
    Date data_entrega;

    @OneToOne(cascade = CascadeType.ALL)
    Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    List<Filme> filmes;

}
