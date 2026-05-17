package com.manutencaoerp.dev.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "manutencao")
public class Manutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manutencao_id")
    @Getter
    @Setter
    private Integer manutencaoId;

    @Column(name = "problema_relatado",nullable = false)
    @Getter
    @Setter
    private String problemaRelatado;

    @Column(name = "defeito_constatado",nullable = false)
    @Getter
    @Setter
    private String defeitoConstatado;

    @Column(name = "servico_realizado",nullable = false)
    @Getter
    @Setter
    private String servicoRealizado;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordem_servico_id")
    @Getter
    private OrdemServico ordemServico;

    public Manutencao(){}
}
