package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela USER
 * @generated
 */
@Entity
@Table(name = "\"USER\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"login" }))
@XmlRootElement
public class User implements Serializable {

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
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  
  /**
  * @generated
  */
  @Column(name = "name", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String name;
  
  /**
  * @generated
  */
  @Column(name = "login", nullable = false, unique = true, insertable=true, updatable=true)
  private java.lang.String login;
  
  /**
  * @generated
  */
  @Column(name = "picture", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String picture;
  
  /**
  * @generated
  */
  @Column(name = "password", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String password;
  
  /**
  * @generated
  */
  @Column(name = "theme", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String theme;
  
  /**
  * @generated
  */
  @Column(name = "sobrenome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String sobrenome;
  
  /**
  * @generated
  */
  @Column(name = "idade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer idade;
  
  /**
  * @generated
  */
  @Column(name = "escolaridade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String escolaridade;
  
  /**
  * @generated
  */
  @Column(name = "classificacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String classificacao;
  
  /**
  * @generated
  */
  @Column(name = "curso", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String curso;
  
  /**
  * @generated
  */
  @Column(name = "skype", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String skype;
  
  /**
  * @generated
  */
  @Column(name = "whatsapp", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String whatsapp;
  
  /**
  * @generated
  */
  @Column(name = "facebook", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String facebook;
  
  /**
  * @generated
  */
  @Column(name = "instagram", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String instagram;
  
  /**
  * @generated
  */
  @Column(name = "linkedin", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String linkedin;
  
  /**
  * @generated
  */
  @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer telefone;
  
  /**
  * @generated
  */
  @Column(name = "celular", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer celular;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "iduser", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String iduser;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_empresa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Empresa empresa;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cargo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Cargo cargo;
  
  /**
   * Construtor
   * @generated
   */
  public User(){
  }

  
  /**
   * Obtém email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public User setEmail(java.lang.String email){
    this.email = email;
    return this;
  }
  
  /**
   * Obtém name
   * return name
   * @generated
   */
  public java.lang.String getName(){
    return this.name;
  }
  
  /**
   * Define name
   * @param name name
   * @generated
   */
  public User setName(java.lang.String name){
    this.name = name;
    return this;
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
  public User setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém login
   * return login
   * @generated
   */
  public java.lang.String getLogin(){
    return this.login;
  }
  
  /**
   * Define login
   * @param login login
   * @generated
   */
  public User setLogin(java.lang.String login){
    this.login = login;
    return this;
  }
  
  /**
   * Obtém picture
   * return picture
   * @generated
   */
  public java.lang.String getPicture(){
    return this.picture;
  }
  
  /**
   * Define picture
   * @param picture picture
   * @generated
   */
  public User setPicture(java.lang.String picture){
    this.picture = picture;
    return this;
  }
  
  /**
   * Obtém password
   * return password
   * @generated
   */
  public java.lang.String getPassword(){
    return this.password;
  }
  
  /**
   * Define password
   * @param password password
   * @generated
   */
  public User setPassword(java.lang.String password){
    this.password = password;
    return this;
  }
  
  /**
   * Obtém theme
   * return theme
   * @generated
   */
  public java.lang.String getTheme(){
    return this.theme;
  }
  
  /**
   * Define theme
   * @param theme theme
   * @generated
   */
  public User setTheme(java.lang.String theme){
    this.theme = theme;
    return this;
  }
  
  /**
   * Obtém sobrenome
   * return sobrenome
   * @generated
   */
  public java.lang.String getSobrenome(){
    return this.sobrenome;
  }
  
  /**
   * Define sobrenome
   * @param sobrenome sobrenome
   * @generated
   */
  public User setSobrenome(java.lang.String sobrenome){
    this.sobrenome = sobrenome;
    return this;
  }
  
  /**
   * Obtém idade
   * return idade
   * @generated
   */
  public java.lang.Integer getIdade(){
    return this.idade;
  }
  
  /**
   * Define idade
   * @param idade idade
   * @generated
   */
  public User setIdade(java.lang.Integer idade){
    this.idade = idade;
    return this;
  }
  
  /**
   * Obtém escolaridade
   * return escolaridade
   * @generated
   */
  public java.lang.String getEscolaridade(){
    return this.escolaridade;
  }
  
  /**
   * Define escolaridade
   * @param escolaridade escolaridade
   * @generated
   */
  public User setEscolaridade(java.lang.String escolaridade){
    this.escolaridade = escolaridade;
    return this;
  }
  
  /**
   * Obtém classificacao
   * return classificacao
   * @generated
   */
  public java.lang.String getClassificacao(){
    return this.classificacao;
  }
  
  /**
   * Define classificacao
   * @param classificacao classificacao
   * @generated
   */
  public User setClassificacao(java.lang.String classificacao){
    this.classificacao = classificacao;
    return this;
  }
  
  /**
   * Obtém curso
   * return curso
   * @generated
   */
  public java.lang.String getCurso(){
    return this.curso;
  }
  
  /**
   * Define curso
   * @param curso curso
   * @generated
   */
  public User setCurso(java.lang.String curso){
    this.curso = curso;
    return this;
  }
  
  /**
   * Obtém skype
   * return skype
   * @generated
   */
  public java.lang.String getSkype(){
    return this.skype;
  }
  
  /**
   * Define skype
   * @param skype skype
   * @generated
   */
  public User setSkype(java.lang.String skype){
    this.skype = skype;
    return this;
  }
  
  /**
   * Obtém whatsapp
   * return whatsapp
   * @generated
   */
  public java.lang.String getWhatsapp(){
    return this.whatsapp;
  }
  
  /**
   * Define whatsapp
   * @param whatsapp whatsapp
   * @generated
   */
  public User setWhatsapp(java.lang.String whatsapp){
    this.whatsapp = whatsapp;
    return this;
  }
  
  /**
   * Obtém facebook
   * return facebook
   * @generated
   */
  public java.lang.String getFacebook(){
    return this.facebook;
  }
  
  /**
   * Define facebook
   * @param facebook facebook
   * @generated
   */
  public User setFacebook(java.lang.String facebook){
    this.facebook = facebook;
    return this;
  }
  
  /**
   * Obtém instagram
   * return instagram
   * @generated
   */
  public java.lang.String getInstagram(){
    return this.instagram;
  }
  
  /**
   * Define instagram
   * @param instagram instagram
   * @generated
   */
  public User setInstagram(java.lang.String instagram){
    this.instagram = instagram;
    return this;
  }
  
  /**
   * Obtém linkedin
   * return linkedin
   * @generated
   */
  public java.lang.String getLinkedin(){
    return this.linkedin;
  }
  
  /**
   * Define linkedin
   * @param linkedin linkedin
   * @generated
   */
  public User setLinkedin(java.lang.String linkedin){
    this.linkedin = linkedin;
    return this;
  }
  
  /**
   * Obtém telefone
   * return telefone
   * @generated
   */
  public java.lang.Integer getTelefone(){
    return this.telefone;
  }
  
  /**
   * Define telefone
   * @param telefone telefone
   * @generated
   */
  public User setTelefone(java.lang.Integer telefone){
    this.telefone = telefone;
    return this;
  }
  
  /**
   * Obtém celular
   * return celular
   * @generated
   */
  public java.lang.Integer getCelular(){
    return this.celular;
  }
  
  /**
   * Define celular
   * @param celular celular
   * @generated
   */
  public User setCelular(java.lang.Integer celular){
    this.celular = celular;
    return this;
  }
  
  /**
   * Obtém nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public User setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém iduser
   * return iduser
   * @generated
   */
  public java.lang.String getIduser(){
    return this.iduser;
  }
  
  /**
   * Define iduser
   * @param iduser iduser
   * @generated
   */
  public User setIduser(java.lang.String iduser){
    this.iduser = iduser;
    return this;
  }
  
  /**
   * Obtém empresa
   * return empresa
   * @generated
   */
  public Empresa getEmpresa(){
    return this.empresa;
  }
  
  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public User setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }
  
  /**
   * Obtém cargo
   * return cargo
   * @generated
   */
  public Cargo getCargo(){
    return this.cargo;
  }
  
  /**
   * Define cargo
   * @param cargo cargo
   * @generated
   */
  public User setCargo(Cargo cargo){
    this.cargo = cargo;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    User object = (User)obj;
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
