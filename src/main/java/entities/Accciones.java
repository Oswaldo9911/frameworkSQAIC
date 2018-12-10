/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SQA
 */
@Entity
@Table(name = "accciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accciones.findAll", query = "SELECT a FROM Accciones a")
    , @NamedQuery(name = "Accciones.findById", query = "SELECT a FROM Accciones a WHERE a.id = :id")
    , @NamedQuery(name = "Accciones.findByNombreAccion", query = "SELECT a FROM Accciones a WHERE a.nombreAccion = :nombreAccion")
    , @NamedQuery(name = "Accciones.findByIdGrupoAccion", query = "SELECT a FROM Accciones a WHERE a.idGrupoAccion = :idGrupoAccion")})
public class Accciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Nombre_Accion")
    private String nombreAccion;
    @Basic(optional = false)
    @Column(name = "Id_Grupo_Accion")
    private int idGrupoAccion;
    @JoinTable(name = "acciones_ambiente", joinColumns = {
        @JoinColumn(name = "Id_Acciones", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "Id_Ambiente", referencedColumnName = "Id_Ambientes")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Ambientes> ambientesList;
    @JoinColumn(name = "grupo_acciones_Id", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GrupoAcciones grupoaccionesId;

    public Accciones() {
    }

    public Accciones(Integer id) {
        this.id = id;
    }

    public Accciones(Integer id, String nombreAccion, int idGrupoAccion) {
        this.id = id;
        this.nombreAccion = nombreAccion;
        this.idGrupoAccion = idGrupoAccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreAccion() {
        return nombreAccion;
    }

    public void setNombreAccion(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }

    public int getIdGrupoAccion() {
        return idGrupoAccion;
    }

    public void setIdGrupoAccion(int idGrupoAccion) {
        this.idGrupoAccion = idGrupoAccion;
    }

    @XmlTransient
    public List<Ambientes> getAmbientesList() {
        return ambientesList;
    }

    public void setAmbientesList(List<Ambientes> ambientesList) {
        this.ambientesList = ambientesList;
    }

    public GrupoAcciones getGrupoaccionesId() {
        return grupoaccionesId;
    }

    public void setGrupoaccionesId(GrupoAcciones grupoaccionesId) {
        this.grupoaccionesId = grupoaccionesId;
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
        if (!(object instanceof Accciones)) {
            return false;
        }
        Accciones other = (Accciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Accciones[ id=" + id + " ]";
    }
    
}
