/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SQA
 */
@Entity
@Table(name = "ambientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ambientes.findAll", query = "SELECT a FROM Ambientes a")
    , @NamedQuery(name = "Ambientes.findByIdAmbientes", query = "SELECT a FROM Ambientes a WHERE a.idAmbientes = :idAmbientes")
    , @NamedQuery(name = "Ambientes.findByNombreAmbiente", query = "SELECT a FROM Ambientes a WHERE a.nombreAmbiente = :nombreAmbiente")})
public class Ambientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Ambientes")
    private Integer idAmbientes;
    @Basic(optional = false)
    @Column(name = "Nombre_Ambiente")
    private String nombreAmbiente;
    @ManyToMany(mappedBy = "ambientesList", fetch = FetchType.LAZY)
    private List<Accciones> acccionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAmbiente", fetch = FetchType.LAZY)
    private List<Escenarios> escenariosList;

    public Ambientes() {
    }

    public Ambientes(Integer idAmbientes) {
        this.idAmbientes = idAmbientes;
    }

    public Ambientes(Integer idAmbientes, String nombreAmbiente) {
        this.idAmbientes = idAmbientes;
        this.nombreAmbiente = nombreAmbiente;
    }

    public Integer getIdAmbientes() {
        return idAmbientes;
    }

    public void setIdAmbientes(Integer idAmbientes) {
        this.idAmbientes = idAmbientes;
    }

    public String getNombreAmbiente() {
        return nombreAmbiente;
    }

    public void setNombreAmbiente(String nombreAmbiente) {
        this.nombreAmbiente = nombreAmbiente;
    }

    @XmlTransient
    public List<Accciones> getAcccionesList() {
        return acccionesList;
    }

    public void setAcccionesList(List<Accciones> acccionesList) {
        this.acccionesList = acccionesList;
    }

    @XmlTransient
    public List<Escenarios> getEscenariosList() {
        return escenariosList;
    }

    public void setEscenariosList(List<Escenarios> escenariosList) {
        this.escenariosList = escenariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAmbientes != null ? idAmbientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ambientes)) {
            return false;
        }
        Ambientes other = (Ambientes) object;
        if ((this.idAmbientes == null && other.idAmbientes != null) || (this.idAmbientes != null && !this.idAmbientes.equals(other.idAmbientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ambientes[ idAmbientes=" + idAmbientes + " ]";
    }
    
}
