package orange.mg.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "role")
public class RoleUser extends PanacheEntity {

    @Id
    @GeneratedValue
    @Column(name = "idrole")
    private Long idRole;


    @Column(name = "nom")
    public String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }
    //@ElementCollection(fetch = FetchType.EAGER)
    //@CollectionTable(name = "role_user_profils", joinColumns = @JoinColumn(name = "id_role"))
    //@Column(name = "profil")
    //public List<String> profils; // Utilisez une liste de chaînes pour stocker les profils




}
