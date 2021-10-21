package com.kevingardner.overflow1.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevingardner.overflow1.models.Answer;
import com.kevingardner.overflow1.models.Question;
import com.kevingardner.overflow1.models.Tag;
import com.kevingardner.overflow1.repositories.AnswerRepository;
import com.kevingardner.overflow1.repositories.QuestionRepository;
import com.kevingardner.overflow1.repositories.TagRepository;

@Service
public class OverflowService {
	@Autowired
	private QuestionRepository qRepo;
	@Autowired 
	private AnswerRepository aRepo;
	@Autowired TagRepository tRepo;
	
	public Tag getOneTag(String subject) {
		return this.tRepo.findBySubject(subject);
	}
	
	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQ = new ArrayList<Tag>();
		String[] tagsToProcess = tags.split(", ");
			for(String s: tagsToProcess) {
			if(this.tRepo.existsBySubject(s)) {
				Tag tagToAdd = this.getOneTag(s);
				tagsForQ.add(tagToAdd);
				}else{
					Tag newTag = new Tag();
					newTag.setSubject(s);
					this.tRepo.save(newTag);
					tagsForQ.add(this.getOneTag(s));
				}
		}
			return tagsForQ;
			}
	
	public Question createQuestion(Question question) {
			question.setQtags(this.splitTags(question.getTagsFromFrontEnd()));
			return this.qRepo.save(question);
	}
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
}
