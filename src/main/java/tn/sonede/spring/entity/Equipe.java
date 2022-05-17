package tn.sonede.spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="equipe")
    private Set<Employe> employes;


    @OneToOne(cascade = CascadeType.ALL, mappedBy="equipe")
    private Responsable  responsablee;
}
