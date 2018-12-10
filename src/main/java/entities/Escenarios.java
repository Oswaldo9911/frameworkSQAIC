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
import javax.persistence.Lob;
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
@Table(name = "escenarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Escenarios.findAll", query = "SELECT e FROM Escenarios e")
    , @NamedQuery(name = "Escenarios.findById", query = "SELECT e FROM Escenarios e WHERE e.id = :id")
    , @NamedQuery(name = "Escenarios.findByNombreEscenario", query = "SELECT e FROM Escenarios e WHERE e.nombreEscenario = :nombreEscenario")
    , @NamedQuery(name = "Escenarios.findByFechaCreacion", query = "SELECT e FROM Escenarios e WHERE e.fechaCreacion = :fechaCreacion")})
public class Escenarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombreEscenario")
    private String nombreEscenario;
    @Basic(optional = false)
    @Lob
    @Column(name = "descripcionEscenario")
    private String descripcionEscenario;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEscenario", fetch = FetchType.LAZY)
    private List<Casos> casosList;
    @JoinColumn(name = "idSuit", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Suits idSuit;
    @JoinColumn(name = "idAmbiente", referencedColumnName = "Id_Ambientes")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ambientes idAmbiente;

    public Escenarios() {
    }

    public Escenarios(Integer id) {
        this.id = id;
    }

    public Escenarios(Integer id, String nombreEscenario, String descripcionEscenario, Date fechaCreacion) {
        this.id = id;
        this.nombreEscenario = nombreEscenario;
        this.descripcionEscenario = descripcionEscenario;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public String getDescripcionEscenario() {
        return descripcionEscenario;
    }

    public void setDescripcionEscenario(String descripcionEscenario) {
        this.descripcionEscenario = descripcionEscenario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @XmlTransient
    public List<Casos> getCasosList() {
        return casosList;
    }

    public void setCasosList(List<Casos> casosList) {
        this.casosList = casosList;
    }

    public Suits getIdSuit() {
        return idSuit;
    }

    public void setIdSuit(Suits idSuit) {
        this.idSuit = idSuit;
    }

    public Ambientes getIdAmbiente() {
        return idAmbiente;
    }

    public void setIdAmbiente(Ambientes idAmbiente) {
        this.idAmbiente = idAmbiente;
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
        if (!(object instanceof Escenarios)) {
            return false;
        }
        Escenarios other = (Escenarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Escenarios[ id=" + id + " ]";
    }
    
}
