package edu.learn.springboot.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public List<LanguageModel> getAllLanguages() {
        List<LanguageModel> languageModels = new ArrayList<LanguageModel>();
        languageRepository.findAll().forEach(languageModels::add);
        return languageModels;
    }

    @Override
    public LanguageModel getLanguage(String id) {
        return languageRepository.findById(id).get();
    }

    @Override
    public void addLanguage(LanguageModel languageModel) {
        languageRepository.save(languageModel);
    }

    @Override
    public void updateLanguage(LanguageModel languageModel, String id) {
        languageRepository.save(languageModel);
    }

    @Override
    public void deleteLanguage(String id) {
        languageRepository.deleteById(id);
    }
}