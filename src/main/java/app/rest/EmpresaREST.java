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
 * Controller para expor serviços REST de Empresa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/Empresa")
public class EmpresaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EmpresaBusiness")
  private EmpresaBusiness empresaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("UserBusiness")
  private UserBusiness userBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("CidadesBusiness")
  private CidadesBusiness cidadesBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Empresa post(@Validated @RequestBody final Empresa entity) throws Exception {
    return empresaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Empresa put(@Validated @RequestBody final Empresa entity) throws Exception {
    return empresaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{empresaId}")
  public Empresa put(@Validated @RequestBody final Empresa entity, @PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    return empresaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{empresaId}")
  public void delete(@PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    empresaBusiness.delete(empresaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Empresa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{empresaId}/Cidades")    
  public HttpEntity<PagedResources<Cidades>> findCidades(@PathVariable("empresaId") java.lang.String empresaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.findCidades(empresaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{empresaId}/Cidades/{cidadesId}")    
  public void deleteCidades(@PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    this.cidadesBusiness.delete(cidadesId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{empresaId}/Cidades")
  public Cidades putCidades(@Validated @RequestBody final Cidades entity, @PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    return this.cidadesBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{empresaId}/Cidades")
  public Cidades postCidades(@Validated @RequestBody final Cidades entity, @PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    Empresa empresa = this.empresaBusiness.get(empresaId);
    entity.setEmpresa(empresa);
    return this.cidadesBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{empresaId}/User_2")    
  public HttpEntity<PagedResources<User>> findUser_2(@PathVariable("empresaId") java.lang.String empresaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.findUser_2(empresaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{empresaId}/User_2/{user_2Id}")    
  public void deleteUser_2(@PathVariable("user_2Id") java.lang.String user_2Id) throws Exception {
    this.userBusiness.delete(user_2Id);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{empresaId}/User_2")
  public User putUser_2(@Validated @RequestBody final User entity, @PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    return this.userBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{empresaId}/User_2")
  public User postUser_2(@Validated @RequestBody final User entity, @PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    Empresa empresa = this.empresaBusiness.get(empresaId);
    entity.setEmpresa(empresa);
    return this.userBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{empresaId}/User")
  public HttpEntity<PagedResources<User>> listUser(@PathVariable("empresaId") java.lang.String empresaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.listUser(empresaId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{empresaId}/User")
  public Empresa postUser(@Validated @RequestBody final User entity, @PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    Cidades newCidades = new Cidades();

    Empresa empresa = this.empresaBusiness.get(empresaId);

    newCidades.setUser(entity);
    newCidades.setEmpresa(empresa);
    
    this.cidadesBusiness.post(newCidades);

    return newCidades.getEmpresa();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{empresaId}/User/{UserId}")
  public void deleteUser(@PathVariable("empresaId") java.lang.String empresaId, @PathVariable("UserId") java.lang.String UserId) {
    this.empresaBusiness.deleteUser(empresaId, UserId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{empresaId}")
  public Empresa get(@PathVariable("empresaId") java.lang.String empresaId) throws Exception {
    return empresaBusiness.get(empresaId);
  }

  /**
   * Foreign Key pesquisa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Pesquisa/{pesquisaId}")    
  public HttpEntity<PagedResources<Empresa>> findEmpresasByPesquisa(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.findEmpresasByPesquisa(pesquisaId, pageable)), HttpStatus.OK);
  }
}
