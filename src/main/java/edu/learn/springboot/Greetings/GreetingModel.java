package edu.learn.springboot.Greetings;

import edu.learn.springboot.language.LanguageModel;

import javax.persistence.*;

@Entity
@Table (name = "greeting")
public class GreetingModel {

    @Id
    @Column(name = "g_Id")
    private String greetId;

    @Column(name = "greeting_name")
    private String greetingName;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "l_Id",foreignKey = @ForeignKey(name = "greeting_lang_FK"))
    private LanguageModel languageModel;

    public GreetingModel() {
    }

    /**
     * Parameter Constructor
     *
     * @param greetId
     * @param greetingName
     * @param description
     * @param langId maps the greetingName with languageModel using ManyToOne relation.
     */
    public GreetingModel(String greetId, String greetingName, String description, String langId) {
        this.greetId = greetId;
        this.greetingName = greetingName;
        this.description = description;
        this.languageModel = new LanguageModel(langId);
    }

    public String getGreetId() {
        return greetId;
    }

    public void setGreetId(String greetId) {
        this.greetId = greetId;
    }

    public String getGreetingName() {
        return greetingName;
    }

    public void setGreetingName(String greetingName) {
        this.greetingName = greetingName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LanguageModel getLanguageModel() {
        return languageModel;
    }

    public void setLanguageModel(LanguageModel languageModel) {
        this.languageModel = languageModel;
    }
}
