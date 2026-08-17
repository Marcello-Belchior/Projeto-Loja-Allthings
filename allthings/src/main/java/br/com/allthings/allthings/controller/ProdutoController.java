package br.com.allthings.allthings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.allthings.allthings.entity.Categoria;
import br.com.allthings.allthings.entity.Fornecedor;
import br.com.allthings.allthings.entity.Produto;
import br.com.allthings.allthings.service.CategoriaService;
import br.com.allthings.allthings.service.FornecedorService;
import br.com.allthings.allthings.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private CategoriaService categoriaService;
    
    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private FornecedorService fornecedorService;

    //  Método para salvar um produto
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Produto produto) {
        produtoService.save(produto);
        return "redirect:/produtos/listar";
    }

    //  Método para listar todos os produtos 
    @GetMapping("/listar") 
    public String listar(Model model) {
        List<Produto> produtos= produtoService.findAll();
        model.addAttribute("produtos", produtos);
        return "Produto/listarProduto"; 
    }

    //  Método para criar formulário
    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("produto", new Produto());
        List<Fornecedor> fornecedores = fornecedorService.findAll();
        model.addAttribute("fornecedores", fornecedores);
        List<Categoria> categorias = categoriaService.findAll();
        model.addAttribute("categorias", categorias);
        return "Produto/formularioProduto";
    }

    //Método para excluir o produto
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
    produtoService.deleteById(id);
    return "redirect:/produtos/listar";
}

    //Método para editar o formulario
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
    Produto produto = produtoService.findById(id);
    model.addAttribute("produto", produto);
    return "Produto/formularioProduto";
}
}
