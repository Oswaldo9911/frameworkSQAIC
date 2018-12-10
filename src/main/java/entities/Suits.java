/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SQA
 */
@Entity
@Table(name = "suits")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Suits.findAll", query = "SELECT s FROM Suits s")
    , @NamedQuery(name = "Suits.findById", query = "SELECT s FROM Suits s WHERE s.id = :id")
    , @NamedQuery(name = "Suits.findByNombreSuit", query = "SELECT s FROM Suits s WHERE s.nombreSuit = :nombreSuit")
    , @NamedQuery(name = "Suits.findByDescripcionSuit", query = "SELECT s FROM Suits s WHERE s.descripcionSuit = :descripcionSuit")
    , @NamedQuery(name = "Suits.findByFechaCreacion", query = "SELECT s FROM Suits s WHERE s.fechaCreacion = :fechaCreacion")})
public class Suits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombreSuit")
    private String nombreSuit;
    @Basic(optional = false)
    @Column(name = "descripcionSuit")
    private String descripcionSuit;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSuit", fetch = FetchType.LAZY)
    private List<Escenarios> escenariosList;
    @JoinColumn(name = "usuarios_idususario", referencedColumnName = "idususario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios usuariosIdususario;

    public Suits() {
    }

    public Suits(Integer id) {
        this.id = id;
    }

    public Suits(Integer id, String nombreSuit, String descripcionSuit, Date fechaCreacion) {
        this.id = id;
        this.nombreSuit = nombreSuit;
        this.descripcionSuit = descripcionSuit;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreSuit() {
        return nombreSuit;
    }

    public void setNombreSuit(String nombreSuit) {
        this.nombreSuit = nombreSuit;
    }

    public String getDescripcionSuit() {
        return descripcionSuit;
    }

    public void setDescripcionSuit(String descripcionSuit) {
        this.descripcionSuit = descripcionSuit;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @XmlTransient
    public List<Escenarios> getEscenariosList() {
        return escenariosList;
    }

    public void setEscenariosList(List<Escenarios> escenariosList) {
        this.escenariosList = escenariosList;
    }

    public Usuarios getUsuariosIdususario() {
        return usuariosIdususario;
    }

    public void setUsuariosIdususario(Usuarios usuariosIdususario) {
        this.usuariosIdususario = usuariosIdususario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suits)) {
            return false;
        }
        Suits other = (Suits) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Suits[ id=" + id + " ]";
    }
    
}
