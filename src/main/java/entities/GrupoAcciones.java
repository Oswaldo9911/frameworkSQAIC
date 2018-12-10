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
@Table(name = "grupo_acciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoAcciones.findAll", query = "SELECT g FROM GrupoAcciones g")
    , @NamedQuery(name = "GrupoAcciones.findById", query = "SELECT g FROM GrupoAcciones g WHERE g.id = :id")
    , @NamedQuery(name = "GrupoAcciones.findByNombreGrupoAccion", query = "SELECT g FROM GrupoAcciones g WHERE g.nombreGrupoAccion = :nombreGrupoAccion")})
public class GrupoAcciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Nombre_Grupo_Accion")
    private String nombreGrupoAccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grupoaccionesId", fetch = FetchType.LAZY)
    private List<Accciones> acccionesList;

    public GrupoAcciones() {
    }

    public GrupoAcciones(Integer id) {
        this.id = id;
    }

    public GrupoAcciones(Integer id, String nombreGrupoAccion) {
        this.id = id;
        this.nombreGrupoAccion = nombreGrupoAccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreGrupoAccion() {
        return nombreGrupoAccion;
    }

    public void setNombreGrupoAccion(String nombreGrupoAccion) {
        this.nombreGrupoAccion = nombreGrupoAccion;
    }

    @XmlTransient
    public List<Accciones> getAcccionesList() {
        return acccionesList;
    }

    public void setAcccionesList(List<Accciones> acccionesList) {
        this.acccionesList = acccionesList;
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
        if (!(object instanceof GrupoAcciones)) {
            return false;
        }
        GrupoAcciones other = (GrupoAcciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.GrupoAcciones[ id=" + id + " ]";
    }
    
}
