package br.com.allthings.allthings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.allthings.allthings.entity.Fornecedor;

import br.com.allthings.allthings.repository.FornecedorRepository;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    //Método para salvar um Fornecedor
    public Fornecedor save(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    //Método para listar todos os fornecedores
    public List<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }

    //Método para excluir fornecedor pelo ID
    public void deleteById(Integer id){
        fornecedorRepository.deleteById(id);
    }

    //Método para buscar o fornecedor pelo Id
    public Fornecedor findById(Integer id){
        return fornecedorRepository.findById(id).orElse(null);
    }
}
