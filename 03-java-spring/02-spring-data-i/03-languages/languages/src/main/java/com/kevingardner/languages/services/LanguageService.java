package com.kevingardner.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kevingardner.languages.models.Language;
import com.kevingardner.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo;
		
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
		// TODO Auto-generated constructor stub
	}
	public List<Language> allLanguages(){
		return this.lRepo.findAll();
	}
	public Language findLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Language createLanguage(Language newLang) {
		return this.lRepo.save(newLang);
	}
	public Language updateLanguage(Language updateLang) {
		return this.lRepo.save(updateLang);
	}
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}
