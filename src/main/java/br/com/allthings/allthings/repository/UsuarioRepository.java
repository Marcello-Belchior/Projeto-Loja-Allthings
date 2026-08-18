package br.com.allthings.allthings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.allthings.allthings.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{


}
