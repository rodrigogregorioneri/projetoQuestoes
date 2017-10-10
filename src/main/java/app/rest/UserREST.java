package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de User
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/security/User")
public class UserREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("UserBusiness")
  private UserBusiness userBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EmpresaBusiness")
  private EmpresaBusiness empresaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("RoleBusiness")
  private RoleBusiness roleBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("TecnologiasBusiness")
  private TecnologiasBusiness tecnologiasBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("CidadesBusiness")
  private CidadesBusiness cidadesBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("RespostasBusiness")
  private RespostasBusiness respostasBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("UserRoleBusiness")
  private UserRoleBusiness userRoleBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public User post(@Validated @RequestBody final User entity) throws Exception {
    return userBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public User put(@Validated @RequestBody final User entity) throws Exception {
    return userBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{userId}")
  public User put(@Validated @RequestBody final User entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    return userBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
  public void delete(@PathVariable("userId") java.lang.String userId) throws Exception {
    userBusiness.delete(userId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<User>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(userBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery findByRole
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/findByRole/{roleid}")
  public HttpEntity<PagedResources<User>> findByRoleParams(@PathVariable("roleid") java.lang.String roleid, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(userBusiness.findByRole(roleid, pageable)), HttpStatus.OK);    
  }

  /**
   * NamedQuery findByLogin
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/findByLogin/{login}")
  public HttpEntity<PagedResources<User>> findByLoginParams(@PathVariable("login") java.lang.String login, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(userBusiness.findByLogin(login, pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{userId}/Tecnologias")    
  public HttpEntity<PagedResources<Tecnologias>> findTecnologias(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.findTecnologias(userId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{userId}/Tecnologias/{tecnologiasId}")    
  public void deleteTecnologias(@PathVariable("tecnologiasId") java.lang.String tecnologiasId) throws Exception {
    this.tecnologiasBusiness.delete(tecnologiasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{userId}/Tecnologias")
  public Tecnologias putTecnologias(@Validated @RequestBody final Tecnologias entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    return this.tecnologiasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{userId}/Tecnologias")
  public Tecnologias postTecnologias(@Validated @RequestBody final Tecnologias entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    User user = this.userBusiness.get(userId);
    entity.setUser(user);
    return this.tecnologiasBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{userId}/Cidades")    
  public HttpEntity<PagedResources<Cidades>> findCidades(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.findCidades(userId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{userId}/Cidades/{cidadesId}")    
  public void deleteCidades(@PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    this.cidadesBusiness.delete(cidadesId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{userId}/Cidades")
  public Cidades putCidades(@Validated @RequestBody final Cidades entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    return this.cidadesBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{userId}/Cidades")
  public Cidades postCidades(@Validated @RequestBody final Cidades entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    User user = this.userBusiness.get(userId);
    entity.setUser(user);
    return this.cidadesBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{userId}/Respostas")    
  public HttpEntity<PagedResources<Respostas>> findRespostas(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.findRespostas(userId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{userId}/Respostas/{respostasId}")    
  public void deleteRespostas(@PathVariable("respostasId") java.lang.String respostasId) throws Exception {
    this.respostasBusiness.delete(respostasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{userId}/Respostas")
  public Respostas putRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    return this.respostasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{userId}/Respostas")
  public Respostas postRespostas(@Validated @RequestBody final Respostas entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    User user = this.userBusiness.get(userId);
    entity.setUser(user);
    return this.respostasBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{userId}/UserRole")    
  public HttpEntity<PagedResources<UserRole>> findUserRole(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.findUserRole(userId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{userId}/UserRole/{userRoleId}")    
  public void deleteUserRole(@PathVariable("userRoleId") java.lang.String userRoleId) throws Exception {
    this.userRoleBusiness.delete(userRoleId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{userId}/UserRole")
  public UserRole putUserRole(@Validated @RequestBody final UserRole entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    return this.userRoleBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{userId}/UserRole")
  public UserRole postUserRole(@Validated @RequestBody final UserRole entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    User user = this.userBusiness.get(userId);
    entity.setUser(user);
    return this.userRoleBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{userId}/Empresa")
  public HttpEntity<PagedResources<Empresa>> listEmpresa(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.listEmpresa(userId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{userId}/Empresa")
  public User postEmpresa(@Validated @RequestBody final Empresa entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    Cidades newCidades = new Cidades();

    User user = this.userBusiness.get(userId);

    newCidades.setEmpresa(entity);
    newCidades.setUser(user);
    
    this.cidadesBusiness.post(newCidades);

    return newCidades.getUser();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{userId}/Empresa/{EmpresaId}")
  public void deleteEmpresa(@PathVariable("userId") java.lang.String userId, @PathVariable("EmpresaId") java.lang.String EmpresaId) {
    this.userBusiness.deleteEmpresa(userId, EmpresaId);
  }  

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{userId}/Role")
  public HttpEntity<PagedResources<Role>> listRole(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.listRole(userId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{userId}/Role")
  public User postRole(@Validated @RequestBody final Role entity, @PathVariable("userId") java.lang.String userId) throws Exception {
    UserRole newUserRole = new UserRole();

    User user = this.userBusiness.get(userId);

    newUserRole.setRole(entity);
    newUserRole.setUser(user);
    
    this.userRoleBusiness.post(newUserRole);

    return newUserRole.getUser();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{userId}/Role/{RoleId}")
  public void deleteRole(@PathVariable("userId") java.lang.String userId, @PathVariable("RoleId") java.lang.String RoleId) {
    this.userBusiness.deleteRole(userId, RoleId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
  public User get(@PathVariable("userId") java.lang.String userId) throws Exception {
    return userBusiness.get(userId);
  }

  /**
   * Foreign Key empresa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Empresa/{empresaId}")    
  public HttpEntity<PagedResources<User>> findUsersByEmpresa(@PathVariable("empresaId") java.lang.String empresaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.findUsersByEmpresa(empresaId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key cargo
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Cargo/{cargoId}")    
  public HttpEntity<PagedResources<User>> findUsersByCargo(@PathVariable("cargoId") java.lang.String cargoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(userBusiness.findUsersByCargo(cargoId, pageable)), HttpStatus.OK);
  }
}
