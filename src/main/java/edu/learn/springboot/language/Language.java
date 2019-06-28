package edu.learn.springboot.language;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {

    @Id
    private String langId;
    private String language;
    private String description;

    public Language() {
    }

    public Language(String langId) {
        this.langId = langId;
    }

    /**
     * Parameter Constructor
     * @param langId
     * @param language
     * @param description
     */

    public Language(String langId, String language, String description) {
        this.langId = langId;
        this.language = language;
        this.description = description;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
