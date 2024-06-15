package com.example.micro_product.repository;

import com.example.micro_product.entity.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepository extends CrudRepository<Produit, Integer> {
}
