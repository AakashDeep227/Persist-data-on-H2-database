package com.onlinestore.repository;

import com.onlinestore.enitity.customerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepository extends CrudRepository <customerEntity, Integer>
{

}
