package io.springSecurity.jwt.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.springSecurity.jwt.models.ClothModel;

@Repository
public interface AllItemsDAO extends CrudRepository<ClothModel, Integer>{

}
