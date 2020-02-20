package com.ascorp.com.ascorp.productcatalog.repository;
import org.springframework.data.repository.CrudRepository;

import com.ascorp.com.ascorp.productcatalog.model.UserRecord;  
public interface UserRepository extends CrudRepository<UserRecord, String> {  
}  