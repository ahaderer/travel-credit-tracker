package com.example.travelcredittracker.models.data;

import com.example.travelcredittracker.models.Credit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CreditDao extends CrudRepository<Credit, Integer> {
}
