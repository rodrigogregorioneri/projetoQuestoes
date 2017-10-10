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
 * Controller para expor serviços REST de Cargo
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/app/Cargo")
public class CargoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CargoBusiness")
  private CargoBusiness cargoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("UserBusiness")
  private UserBusiness userBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Cargo post(@Validated @RequestBody final Cargo entity) throws Exception {
    return cargoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cargo put(@Validated @RequestBody final Cargo entity) throws Exception {
    return cargoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{cargoId}")
  public Cargo put(@Validated @RequestBody final Cargo entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return cargoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{cargoId}")
  public void delete(@PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    cargoBusiness.delete(cargoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Cargo>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(cargoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{cargoId}/User")    
  public HttpEntity<PagedResources<User>> findUser(@PathVariable("cargoId") java.lang.String cargoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cargoBusiness.findUser(cargoId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{cargoId}/User/{userId}")    
  public void deleteUser(@PathVariable("userId") java.lang.String userId) throws Exception {
    this.userBusiness.delete(userId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{cargoId}/User")
  public User putUser(@Validated @RequestBody final User entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return this.userBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{cargoId}/User")
  public User postUser(@Validated @RequestBody final User entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    Cargo cargo = this.cargoBusiness.get(cargoId);
    entity.setCargo(cargo);
    return this.userBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{cargoId}")
  public Cargo get(@PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return cargoBusiness.get(cargoId);
  }
}
