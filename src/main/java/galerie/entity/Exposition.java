/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.NonNull;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author saifmohanad
 */
public class Exposition {
     @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate debut;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private Integer duree;
    

    @ManyToMany(mappedBy = "accrochages")
    List<Exposition> oeuvres = new LinkedList<>();
    
    @OneToMany(mappedBy="lieuDeVente")
    List<Transaction> ventes = new LinkedList<>();
    
    @ManyToOne
    private Galerie galerie;
    
    
}

