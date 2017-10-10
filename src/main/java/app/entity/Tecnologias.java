package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela TECNOLOGIAS
 * @generated
 */
@Entity
@Table(name = "\"TECNOLOGIAS\"")
@XmlRootElement
public class Tecnologias implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "nome_tecnologia", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome_tecnologia;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private User user;
  
  /**
   * Construtor
   * @generated
   */
  public Tecnologias(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Tecnologias setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome_tecnologia
   * return nome_tecnologia
   * @generated
   */
  public java.lang.String getNome_tecnologia(){
    return this.nome_tecnologia;
  }
  
  /**
   * Define nome_tecnologia
   * @param nome_tecnologia nome_tecnologia
   * @generated
   */
  public Tecnologias setNome_tecnologia(java.lang.String nome_tecnologia){
    this.nome_tecnologia = nome_tecnologia;
    return this;
  }
  
  /**
   * Obtém user
   * return user
   * @generated
   */
  public User getUser(){
    return this.user;
  }
  
  /**
   * Define user
   * @param user user
   * @generated
   */
  public Tecnologias setUser(User user){
    this.user = user;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Tecnologias object = (Tecnologias)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}
