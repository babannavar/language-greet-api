package edu.learn.springboot.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {

@Autowired
LanguageServiceImpl languageServiceImpl;

    /**
     * Retrieve all languages
     * @return
     */
    @RequestMapping("/languages")
    public List<LanguageModel> getAllLanguages(){
        return languageServiceImpl.getAllLanguages();
    }

    /**
     * Retrieve particular languages
     * @param id
     * @return
     */
    @RequestMapping("/languages/{id}")
    public LanguageModel getLanguage(@PathVariable String id){
        return languageServiceImpl.getLanguage(id);
    }

    /**
     * Add new languageModel
     * @param languageModel
     */
    @RequestMapping(method = RequestMethod.POST,value="/languages")
    public void addLanguage(@RequestBody LanguageModel languageModel){
        System.out.println("---->"+ languageModel.getLanguageName());
        languageServiceImpl.addLanguage(languageModel);
    }

    /**
     * Update the languageModel if not present add it
     * @param languageModel
     * @param id
     */
    @RequestMapping(method = RequestMethod.PUT,value="/languages/{id}")
    public void addLanguage(@RequestBody LanguageModel languageModel, @PathVariable String id){
        languageServiceImpl.updateLanguage(languageModel,id);
    }

    /**
     * Delete language
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE,value="/languages/{id}")
    public void deleteLanguage(@PathVariable String id){
        languageServiceImpl.deleteLanguage(id);
    }
}
