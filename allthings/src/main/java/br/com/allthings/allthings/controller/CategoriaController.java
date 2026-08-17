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
import br.com.allthings.allthings.service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
     @Autowired
    private CategoriaService categoriaService;

    //  Método para salvar uma categoria
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Categoria categoria) {
        categoriaService.save(categoria);
        return "redirect:/categorias/listar";
    }

    //  Método para listar todas as categorias
    @GetMapping("/listar")
    public String listar(Model model) {
        List<Categoria> categorias = categoriaService.findAll();
        model.addAttribute("categorias", categorias);
        return "categoria/listarCategoria";
    }

    //  Método para criar categoria
    @GetMapping("/criar")
    public String criarForm(Model model){
        model.addAttribute("categoria", new Categoria());
        return "categoria/formularioCategoria";
    }

    //Método para excluir a categoria
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
    categoriaService.deleteById(id);
    return "redirect:/categorias/listar";
}

    //Método para editar o formulario
    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Integer id, Model model) {
    Categoria categoria = categoriaService.findById(id);
    model.addAttribute("categoria", categoria);
    return "categoria/formularioCategoria";
}
}
