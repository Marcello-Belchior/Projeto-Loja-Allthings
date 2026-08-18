package br.com.allthings.allthings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.allthings.allthings.entity.Usuario;
import br.com.allthings.allthings.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

     //Método para salvar um Usuario
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //Método para listar todos os produtos
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    //Método para excluir produto pelo ID
    public void deleteById(Integer id){
        usuarioRepository.deleteById(id);
    }

    //Método para buscar o produto pelo Id
    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }
}
