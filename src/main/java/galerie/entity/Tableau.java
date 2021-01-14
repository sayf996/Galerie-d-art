/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.NonNull;

/**
 *
 * @author saifmohanad
 */
public class Tableau {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;
    
    @Column(unique=true)
    @NonNull
    private String support;
    
    @Column(unique=true)
    @NonNull
    private Integer largeur;
    
    @Column(unique=true)
    @NonNull
    private Integer hauteur;
    
    @ManyToMany(mappedBy = "oeuvres")
    List<Exposition> expositions = new LinkedList<>();
    
    @OneToOne(mappedBy="tableau")
    Transaction transaction;
    
    @ManyToOne
    Artiste artiste;
}

