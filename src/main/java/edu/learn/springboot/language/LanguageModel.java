package edu.learn.springboot.language;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "language")
public class LanguageModel {

    @Id
    @Column(name = "l_Id")
    private String langId;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "description")
    private String description;

    public LanguageModel() {
    }

    public LanguageModel(String langId) {
        this.langId = langId;
    }

    /**
     * Parameter Constructor
     * @param langId
     * @param languageName
     * @param description
     */
    public LanguageModel(String langId, String languageName, String description) {
        this.langId = langId;
        this.languageName = languageName;
        this.description = description;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
