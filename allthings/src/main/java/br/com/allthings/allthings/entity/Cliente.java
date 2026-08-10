package br.com.allthings.allthings.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliente;

    @Column(nullable = false, length = 40)
    private String nomeCliente;

    @Column(nullable = false, length = 40)
    private String enderecoCliente;

    @Column(nullable = false, length = 40)
    private String cidadeCliente;

    @Column(nullable = false, length = 10)
    private String estadoCliente;

    @Column(nullable = false, length = 11)
    private Integer cpfCliente;

    @Column(nullable = false, length = 8)
    private Integer cepCliente;

    @Column(nullable = false, length = 9)
    private Integer rgCliente;


}
