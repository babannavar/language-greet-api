package edu.learn.springboot.Greetings;

import edu.learn.springboot.language.Language;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Greeting {

    @Id
    private String greetId;
    private String greeting;
    private String description;
    @ManyToOne
    private Language language;

    public Greeting() {
    }

    /**
     * Parameter Constructor
     *
     * @param greetId
     * @param greeting
     * @param description
     * @param langId maps the greeting with language.
     */
    public Greeting(String greetId, String greeting, String description, String langId) {
        this.greetId = greetId;
        this.greeting = greeting;
        this.description = description;
        this.language = new Language(langId);
    }

    public String getGreetId() {
        return greetId;
    }

    public void setGreetId(String greetId) {
        this.greetId = greetId;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
