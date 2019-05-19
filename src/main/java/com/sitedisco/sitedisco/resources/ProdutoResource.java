package com.sitedisco.sitedisco.resources;

import com.sitedisco.sitedisco.models.Produto;
import com.sitedisco.sitedisco.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> getAllProdutos() {

        return produtoRepository.findAll();

    }

    @GetMapping("/produto/{id}")
    public Produto getProdutoById(@PathVariable(value = "id") long id) {

        return produtoRepository.findById(id);

    }

    @PostMapping("/produto")
    public Produto saveProduto(@RequestBody Produto produto) {

        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    public void deleteProduto(@RequestBody Produto produto) {

        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    public Produto updateProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
