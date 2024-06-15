package com.example.micro_product.service;

import com.example.micro_product.entity.Produit;

import java.util.List;

public interface IProduitService {
public Produit getProduitById(int id);
public List<Produit> getAllProduits();
public void DeleteProduitById(int id);
public Produit UpdateProduit(Produit produit,int id);
public Produit AddProduit(Produit produit);
}
