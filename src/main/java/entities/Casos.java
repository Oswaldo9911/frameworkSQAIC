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
@Table(name = "casos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casos.findAll", query = "SELECT c FROM Casos c")
    , @NamedQuery(name = "Casos.findById", query = "SELECT c FROM Casos c WHERE c.id = :id")
    , @NamedQuery(name = "Casos.findByNombreCaso", query = "SELECT c FROM Casos c WHERE c.nombreCaso = :nombreCaso")
    , @NamedQuery(name = "Casos.findByFechaCreacion", query = "SELECT c FROM Casos c WHERE c.fechaCreacion = :fechaCreacion")})
public class Casos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombreCaso")
    private String nombreCaso;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @JoinColumn(name = "IdEscenario", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Escenarios idEscenario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCaso", fetch = FetchType.LAZY)
    private List<Pasos> pasosList;

    public Casos() {
    }

    public Casos(Integer id) {
        this.id = id;
    }

    public Casos(Integer id, String nombreCaso, Date fechaCreacion) {
        this.id = id;
        this.nombreCaso = nombreCaso;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Escenarios getIdEscenario() {
        return idEscenario;
    }

    public void setIdEscenario(Escenarios idEscenario) {
        this.idEscenario = idEscenario;
    }

    @XmlTransient
    public List<Pasos> getPasosList() {
        return pasosList;
    }

    public void setPasosList(List<Pasos> pasosList) {
        this.pasosList = pasosList;
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
        if (!(object instanceof Casos)) {
            return false;
        }
        Casos other = (Casos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Casos[ id=" + id + " ]";
    }
    
}
