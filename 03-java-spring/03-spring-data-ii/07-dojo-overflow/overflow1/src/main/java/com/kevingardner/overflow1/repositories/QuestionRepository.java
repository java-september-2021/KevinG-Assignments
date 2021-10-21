package com.kevingardner.overflow1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevingardner.overflow1.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long>{
	 public List<Question> findAll();
}
