package com.sitedisco.sitedisco.repository;

import com.sitedisco.sitedisco.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);

}
