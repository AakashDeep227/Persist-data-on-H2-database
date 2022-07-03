package com.onlinestore.repository;

import com.onlinestore.enitity.customerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerAddressRepository extends JpaRepository<customerAddress, Integer>
{

}
