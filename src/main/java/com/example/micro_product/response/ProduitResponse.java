package com.example.micro_product.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProduitResponse {
    private int id;
    private String nom;
    private int prix;
    private String categorie;
    private String image;
    private String dim;
    private String matriel;
}
