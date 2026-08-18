package br.com.allthings.allthings.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.allthings.allthings.entity.Categoria;
import br.com.allthings.allthings.service.CategoriaService;

/**
 * Converte o valor do <select> (o idCategoria como String, vindo do formulário)
 * de volta para um objeto Categoria, para que o Spring consiga popular
 * Produto.categoria automaticamente no @ModelAttribute do salvar().
 */
@Component
public class CategoriaConverter implements Converter<String, Categoria> {

    @Autowired
    private CategoriaService categoriaService;

    @Override
    public Categoria convert(String source) {
        if (source == null || source.isBlank()) {
            return null;
        }
        return categoriaService.findById(Integer.valueOf(source));
    }
}
