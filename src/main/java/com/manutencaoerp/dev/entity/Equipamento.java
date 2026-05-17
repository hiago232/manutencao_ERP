package com.manutencaoerp.dev.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equipamento")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_equipamento")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipamento_id")
    @Getter
    @Setter
    private Integer equipamentoId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

}
