package com.chinasoft.it.wecode.fw.spring.data;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * 
 * 通用的 Repositry 实现，如果要开启，请在@EnableJpaRepositories注解上添加repositoriesBaseClass属性
 * QuerydslJpaRepository
 * @author Administrator
 *
 * @param <T>
 * @param <ID>
 */
public class UserRepositryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements UserRepository<T, ID> {

  public UserRepositryImpl(Class<T> domainClass, EntityManager em) {
    super(domainClass, em);
  }

}
