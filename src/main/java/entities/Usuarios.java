/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SQA
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIdususario", query = "SELECT u FROM Usuarios u WHERE u.idususario = :idususario")
    , @NamedQuery(name = "Usuarios.findByDocumento", query = "SELECT u FROM Usuarios u WHERE u.documento = :documento")
    , @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuarios.findByApellido", query = "SELECT u FROM Usuarios u WHERE u.apellido = :apellido")
    , @NamedQuery(name = "Usuarios.findByEmpresa", query = "SELECT u FROM Usuarios u WHERE u.empresa = :empresa")
    , @NamedQuery(name = "Usuarios.findByClave", query = "SELECT u FROM Usuarios u WHERE u.clave = :clave")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idususario")
    private Integer idususario;
    @Column(name = "documento")
    private BigInteger documento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "clave")
    private String clave;
    @JoinColumn(name = "roles_idrol", referencedColumnName = "idrol")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Roles rolesIdrol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuariosIdususario", fetch = FetchType.LAZY)
    private List<Suits> suitsList;

    public Usuarios() {
    }

    public Usuarios(Integer idususario) {
        this.idususario = idususario;
    }

    public Integer getIdususario() {
        return idususario;
    }

    public void setIdususario(Integer idususario) {
        this.idususario = idususario;
    }

    public BigInteger getDocumento() {
        return documento;
    }

    public void setDocumento(BigInteger documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Roles getRolesIdrol() {
        return rolesIdrol;
    }

    public void setRolesIdrol(Roles rolesIdrol) {
        this.rolesIdrol = rolesIdrol;
    }

    @XmlTransient
    public List<Suits> getSuitsList() {
        return suitsList;
    }

    public void setSuitsList(List<Suits> suitsList) {
        this.suitsList = suitsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idususario != null ? idususario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idususario == null && other.idususario != null) || (this.idususario != null && !this.idususario.equals(other.idususario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Usuarios[ idususario=" + idususario + " ]";
    }
    
}
