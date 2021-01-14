/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.NonNull;

/**
 *
 * @author saifmohanad
 */
public class Transaction {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate venduLe;
    
    @Column
    @NonNull
    private Float prixVente;
    
    @ManyToOne
    Personne acheteur;
    
    @ManyToOne
    Exposition lieuDeVente;
    
    @OneToOne
    Tableau tableau;
    
    
}
