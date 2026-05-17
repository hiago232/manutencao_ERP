package com.manutencaoerp.dev.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="cliente")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    @Getter
    @Setter
    private Integer clienteId;

    @Column(name = "endereco")
    @Getter
    @Setter
    private String endereco;

    @Column(name = "cidade")
    @Getter
    @Setter
    private String cidade;

    @Column(name = "estado")
    @Getter
    @Setter
    private String estado;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @Column(name = "cep")
    @Getter
    @Setter
    private String cep;

    @Column(name = "cel")
    @Getter
    @Setter
    private String cel;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    @Getter
    private List<Equipamento> equipamentoList;

    public Cliente(){}


}
