/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SQA
 */
@Entity
@Table(name = "pasos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasos.findAll", query = "SELECT p FROM Pasos p")
    , @NamedQuery(name = "Pasos.findById", query = "SELECT p FROM Pasos p WHERE p.id = :id")
    , @NamedQuery(name = "Pasos.findByActionStep", query = "SELECT p FROM Pasos p WHERE p.actionStep = :actionStep")
    , @NamedQuery(name = "Pasos.findByNavegador", query = "SELECT p FROM Pasos p WHERE p.navegador = :navegador")
    , @NamedQuery(name = "Pasos.findByTypeStep", query = "SELECT p FROM Pasos p WHERE p.typeStep = :typeStep")
    , @NamedQuery(name = "Pasos.findByValueStep", query = "SELECT p FROM Pasos p WHERE p.valueStep = :valueStep")
    , @NamedQuery(name = "Pasos.findByParameterStep", query = "SELECT p FROM Pasos p WHERE p.parameterStep = :parameterStep")
    , @NamedQuery(name = "Pasos.findByCorXStep", query = "SELECT p FROM Pasos p WHERE p.corXStep = :corXStep")
    , @NamedQuery(name = "Pasos.findByCorYStep", query = "SELECT p FROM Pasos p WHERE p.corYStep = :corYStep")})
public class Pasos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "actionStep")
    private String actionStep;
    @Column(name = "navegador")
    private String navegador;
    @Column(name = "typeStep")
    private String typeStep;
    @Column(name = "valueStep")
    private String valueStep;
    @Column(name = "parameterStep")
    private String parameterStep;
    @Column(name = "corXStep")
    private Integer corXStep;
    @Column(name = "corYStep")
    private Integer corYStep;
    @JoinColumn(name = "idCaso", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Casos idCaso;

    public Pasos() {
    }

    public Pasos(Integer id) {
        this.id = id;
    }

    public Pasos(Integer id, String actionStep) {
        this.id = id;
        this.actionStep = actionStep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActionStep() {
        return actionStep;
    }

    public void setActionStep(String actionStep) {
        this.actionStep = actionStep;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String getTypeStep() {
        return typeStep;
    }

    public void setTypeStep(String typeStep) {
        this.typeStep = typeStep;
    }

    public String getValueStep() {
        return valueStep;
    }

    public void setValueStep(String valueStep) {
        this.valueStep = valueStep;
    }

    public String getParameterStep() {
        return parameterStep;
    }

    public void setParameterStep(String parameterStep) {
        this.parameterStep = parameterStep;
    }

    public Integer getCorXStep() {
        return corXStep;
    }

    public void setCorXStep(Integer corXStep) {
        this.corXStep = corXStep;
    }

    public Integer getCorYStep() {
        return corYStep;
    }

    public void setCorYStep(Integer corYStep) {
        this.corYStep = corYStep;
    }

    public Casos getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(Casos idCaso) {
        this.idCaso = idCaso;
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
        if (!(object instanceof Pasos)) {
            return false;
        }
        Pasos other = (Pasos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pasos[ id=" + id + " ]";
    }
    
}
