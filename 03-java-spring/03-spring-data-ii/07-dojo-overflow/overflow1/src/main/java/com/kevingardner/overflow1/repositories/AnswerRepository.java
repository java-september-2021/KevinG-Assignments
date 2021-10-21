package com.kevingardner.overflow1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevingardner.overflow1.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{
	public List<Answer> findAll();

}
