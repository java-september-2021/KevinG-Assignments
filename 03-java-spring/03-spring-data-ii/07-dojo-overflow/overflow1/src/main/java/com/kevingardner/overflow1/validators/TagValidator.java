package com.kevingardner.overflow1.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.kevingardner.overflow1.models.Question;

@Component
public class TagValidator {
	 
	    public boolean supports(Class<?> clazz) {
	        return Question.class.equals(clazz);
	    }
	    
	    
	    // 
	    
	    public void validate(Object target, Errors errors) {
	        Question question = (Question) target;
	        
	        String[] tags = question.getTagsFromFrontEnd().split(", ");
	        if(tags.length > 3 ) {
	        	errors.rejectValue("tagsFromFrontEnd", "too Many", "Must have 3 tags or less");
	        }
	        
	         	
	        }         
	    }


