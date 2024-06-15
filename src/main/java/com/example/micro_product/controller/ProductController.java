package com.example.micro_product.controller;


import com.example.micro_product.entity.Produit;
import com.example.micro_product.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
     ProduitService produitService;

    @GetMapping("/GettAll")
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }
    @GetMapping("/GetById/{id}")
    public Produit getProduitById(@PathVariable("id") int id){
        return produitService.getProduitById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void DeleteProduitById(@PathVariable("id") int id){
        produitService.DeleteProduitById(id);
    }
    @PostMapping("/update/{id}")
    public Produit UpdateProduit(@RequestBody Produit produit,@PathVariable("id") int id){
       return produitService.UpdateProduit(produit,id);
    }
    @PostMapping("/Add")
    public Produit AddProduit(@RequestBody Produit produit){
        return produitService.AddProduit(produit);

    }
}
