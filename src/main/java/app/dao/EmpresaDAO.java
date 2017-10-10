package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("EmpresaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface EmpresaDAO extends JpaRepository<Empresa, java.lang.String> {

  /**
   * Obtém a instância de Empresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Empresa entity WHERE entity.id = :id")
  public Empresa findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Empresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Empresa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Empresa c")
  public Page<Empresa> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Cidades entity WHERE entity.empresa.id = :id")
  public Page<Cidades> findCidades(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.empresa.id = :id")
  public Page<User> findUser_2(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.user FROM Cidades entity WHERE entity.empresa.id = :id")
  public Page<User> listUser(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Cidades entity WHERE entity.empresa.id = :instanceId AND entity.user.id = :relationId")
  public int deleteUser(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key pesquisa
   * @generated
   */
  @Query("SELECT entity FROM Empresa entity WHERE entity.pesquisa.id = :id")
  public Page<Empresa> findEmpresasByPesquisa(@Param(value="id") java.lang.String id, Pageable pageable);

}
