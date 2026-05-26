package com.gestaooserp.dev.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "servico_local_item")
public class ServicoLocalItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "servico_local_item_id",unique = true)
    @Getter
    @Setter
    private Long servicoLocalItemId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @Getter
    @Setter
    private ServicoLocal servicoLocal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @Getter
    @Setter
    private Item item;

    public ServicoLocalItem(){}

    public ServicoLocalItem(ServicoLocalItem servicoLocalItem) {

    }
}
