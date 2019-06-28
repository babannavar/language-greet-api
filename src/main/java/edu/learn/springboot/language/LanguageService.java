package edu.learn.springboot.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAllLanguages() {
        List<Language> languages = new ArrayList<Language>();
        languageRepository.findAll().forEach(languages::add);
        return languages;
    }

    public Language getLanguage(String id) {
        return languageRepository.findById(id).get();
    }

    public void addLanguage(Language language) {
        languageRepository.save(language);
    }

    public void updateLanguage(Language language, String id) {
        languageRepository.save(language);
    }

    public void deleteLanguage(String id) {
       languageRepository.deleteById(id);
    }
}
