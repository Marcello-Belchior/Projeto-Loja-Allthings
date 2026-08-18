package br.com.allthings.allthings.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.allthings.allthings.entity.Fornecedor;
import br.com.allthings.allthings.service.FornecedorService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Converte o valor do <select> (o idFornecedor como String, vindo do formulário)
 * de volta para um objeto Fornecedor, para que o Spring consiga popular
 * Produto.fornecedor automaticamente no @ModelAttribute do salvar().
 */
@Component
public class FornecedorConverter implements Converter<String, Fornecedor> {

    @Autowired
    private FornecedorService fornecedorService;

    @Override
    public Fornecedor convert(String source) {
        if (source == null || source.isBlank()) {
            return null;
        }
        return fornecedorService.findById(Integer.valueOf(source));
    }
}
