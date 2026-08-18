package br.com.allthings.allthings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.allthings.allthings.entity.Categoria;
import br.com.allthings.allthings.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //Método para salvar uma Categoria
    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    //Método para listar todas as categorias
    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    //Método para excluir categoria pelo ID
    public void deleteById(Integer id){
        categoriaRepository.deleteById(id);
    }

    //Método para buscar a categoria pelo Id
    public Categoria findById(Integer id){
        return categoriaRepository.findById(id).orElse(null);
    }
}
