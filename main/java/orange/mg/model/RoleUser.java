package orange.mg.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "role")
public class RoleUser extends PanacheEntityBase {

    @Id
    @Column(name = "idrole")
    private Integer idRole;

    @Column(name = "nom")
    private String nomRole;

    public List<DroitUser> getDroits() {
        return droits;
    }

    public void setDroits(List<DroitUser> droits) {
        this.droits = droits;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roletodroit", joinColumns = @JoinColumn(name = "idrole"), inverseJoinColumns = @JoinColumn(name = "iddroit"))
    public List<DroitUser> droits;

    // Getters and setters
    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }
}
