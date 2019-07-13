package edu.learn.springboot.language;

import java.util.List;

public interface LanguageService {

    public List<LanguageModel> getAllLanguages() ;

    public LanguageModel getLanguage(String id);

    public void addLanguage(LanguageModel languageModel);

    public void updateLanguage(LanguageModel languageModel, String id);

    public void deleteLanguage(String id);
}
