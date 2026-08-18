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
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idFornecedor;

    @Column(nullable = false, length = 40)
    private String nomeFornecedor;

    @Column(nullable = false, length = 40)
    private String enderecoFornecedor;

    @Column(nullable = false, length = 40)
    private String cidadeFornecedor;

    @Column(nullable = false, length = 10)
    private String estadoFornecedor;

    @Column(nullable = false, length = 14)
    private Integer cnpjFornecedor;

    @Column(nullable = false, length = 8)
    private Integer cepFornecedor;
}

