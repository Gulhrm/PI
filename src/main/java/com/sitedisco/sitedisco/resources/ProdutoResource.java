package com.sitedisco.sitedisco.resources;

import com.sitedisco.sitedisco.models.Produto;
import com.sitedisco.sitedisco.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    @ApiOperation(value = "Este metodo lista todos produtos")
    public List<Produto> getAllProdutos() {

        return produtoRepository.findAll();

    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value = "Este metodo retorna um produto unico")
    public Produto getProdutoById(@PathVariable(value = "id") long id) {

        return produtoRepository.findById(id);

    }

    @PostMapping("/produto")
    @ApiOperation(value = "Este metodo salva um produto")
    public Produto saveProduto(@RequestBody Produto produto) {

        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value = "Este metodo deleta produto")
    public void deleteProduto(@RequestBody Produto produto) {

        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    @ApiOperation(value = "Este metodo atualiza produtos")
    public Produto updateProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
