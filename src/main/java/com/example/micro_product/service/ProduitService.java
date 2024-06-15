package com.example.micro_product.service;

import com.example.micro_product.entity.Produit;
import com.example.micro_product.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
@AllArgsConstructor

public class ProduitService implements IProduitService{
    @Autowired
    public ProduitRepository produitRepo;




    @Override
    public Produit getProduitById(int id) {
        return produitRepo.findById(id).orElse(null);
    }

    @Override
    public List<Produit> getAllProduits() {
        ArrayList<Produit> produits = new ArrayList<>((Collection)produitRepo.findAll());
        return produits;
    }

    @Override
    public void DeleteProduitById(int id) {
         produitRepo.deleteById(id);
    }

    @Override
    public Produit UpdateProduit(Produit produit,int id) {
        Produit product = produitRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        product.setCategorie(produit.getCategorie());
        product.setNom(produit.getNom());
        product.setPrix(produit.getPrix());
        product.setDim(produit.getDim());
        product.setImage(produit.getImage());
        product.setMatriel(produit.getMatriel());

        return produitRepo.save(product);
    }

    @Override
    public Produit AddProduit(Produit produit) {
        return produitRepo.save(produit);
    }
}
