package com.gestaooserp.dev.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "insumo")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insumo_id",unique = true,nullable = false)
    @Getter
    @Setter
    private Long insumoId;

    @Column(name = "nome",length = 50, nullable = false)
    @Getter
    @Setter
    private String nome;

    @Column(name = "serial",length = 50,nullable = false)
    @Getter
    @Setter
    private String serial;

    @OneToMany(mappedBy = "item",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    @Getter
    private List<ManutencaoItem> manutencaoItemList;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    @Getter
    private List<ServicoLocalItem> servicoLocalItemList;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    @Getter
    private List<EstoqueItem> estoqueItemList;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    @Getter
    @Setter
    private List<PedidoCompraItem> pedidoCompraItemList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @Getter
    @Setter
    private Fabricante fabricante;

    public Item(){}

    public Item(Item item) {

    }
}
