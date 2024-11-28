package com.edu.cibertec.spring_data_jpa_lymm.repository;

import com.edu.cibertec.spring_data_jpa_lymm.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
