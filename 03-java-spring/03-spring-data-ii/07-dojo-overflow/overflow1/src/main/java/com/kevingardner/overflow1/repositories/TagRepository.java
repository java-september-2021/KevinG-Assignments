package com.kevingardner.overflow1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

			import com.kevingardner.overflow1.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{
	public List<Tag> findAll();
	boolean existsBySubject(String subject); 	
	Tag findBySubject(String subject);

}
