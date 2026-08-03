package br.com.allthings.allthings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.allthings.allthings.entity.Produto;
import br.com.allthings.allthings.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    //Método para salvar um produto
    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    //Método para listar todos os produtos
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
}
