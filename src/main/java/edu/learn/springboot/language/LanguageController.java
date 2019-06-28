package edu.learn.springboot.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {

@Autowired
LanguageService languageService;

    /**
     * Retrieve all languages
     * @return
     */
    @RequestMapping("/languages")
    public List<Language> getAllLanguages(){
        return languageService.getAllLanguages();
    }

    /**
     * Retrieve particular languages
     * @param id
     * @return
     */
    @RequestMapping("/languages/{id}")
    public Language getLanguage(@PathVariable String id){
        return languageService.getLanguage(id);
    }

    /**
     * Add new language
     * @param language
     */
    @RequestMapping(method = RequestMethod.POST,value="/languages")
    public void addLanguage(@RequestBody Language language){
        languageService.addLanguage(language);
    }

    /**
     * Update the language if not present add it
     * @param language
     * @param id
     */
    @RequestMapping(method = RequestMethod.PUT,value="/languages/{id}")
    public void addLanguage(@RequestBody Language language,@PathVariable String id){
        languageService.updateLanguage(language,id);
    }

    /**
     * Delete language
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE,value="/languages/{id}")
    public void deleteLanguage(@PathVariable String id){
        languageService.deleteLanguage(id);
    }
}
