package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;

/**
 * Classe que representa a camada de negócios de EmpresaBusiness
 * 
 * @generated
 **/
@Service("EmpresaBusiness")
public class EmpresaBusiness {



  /**
   * Instância da classe EmpresaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("EmpresaDAO")
  protected EmpresaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Empresa post(final Empresa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Empresa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Empresa put(final Empresa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Empresa result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Empresa entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Empresa get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Empresa result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Empresa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Empresa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Cidades> findCidades(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Cidades> result = repository.findCidades(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<User> findUser_2(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<User> result = repository.findUser_2(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<User> listUser(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<User> result = repository.listUser(id, pageable);
    // begin-user-code
    // end-user-code
    return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteUser(java.lang.String instanceId, java.lang.String relationId) {
    // begin-user-code
    // end-user-code  
    int result = repository.deleteUser(instanceId, relationId);
    // begin-user-code
    // end-user-code  
    return result;  
  }
  /**
   * Foreign Key pesquisa
   * @generated
   */
  public Page<Empresa> findEmpresasByPesquisa(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Empresa> result = repository.findEmpresasByPesquisa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
