package br.com.fiap.myassist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_OBSERVACAO")
public class Observacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OBSERVACAO")
    private Long id;

    @Column(name = "DT_OBSERVACAO")
    private LocalDateTime data;

    @Column(name = "TX_OBSERVACAO")
    private String texto;

    @ManyToOne
    @JoinColumn(name = "ID_ORDEM_SERVICO")
    private OrdemServico ordemServico;

}
