package edu.learn.springboot.Greeting;

import edu.learn.springboot.language.LanguageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

@Autowired
GreetingServiceImpl greetingServiceImpl;


    /**
     * Retrieve all greetings
     * @return
     */
    @RequestMapping("/greetings")
    public List<GreetingModel> getAllGreetings(){
        return greetingServiceImpl.getAllGreetings();
    }

    /**
     * Retrieve particular greetings
     * @param id
     * @return
     */

    @RequestMapping("/greetings/{id}")
    public GreetingModel getGreeting(@PathVariable String id){
        return greetingServiceImpl.getGreeting(id);
    }

    /**
     * Add new greetingModel
     * @param greetingModel
     */

    @RequestMapping(method = RequestMethod.POST,value="/greetings")
    public void addGreeting(@RequestBody GreetingModel greetingModel){
        greetingServiceImpl.addGreeting(greetingModel);
    }

    /**
     * Update the GreetingModel if not present add it
     * @param greetingModel
     * @param id
     */
    @RequestMapping(method = RequestMethod.PUT,value="/greetings/{id}")
    public void updateGreeting(@RequestBody GreetingModel greetingModel, @PathVariable String id){
          greetingServiceImpl.updateGreeting(greetingModel,id);
    }

    /**
     * Delete greeting
     * @param id
     */

    @RequestMapping(method = RequestMethod.DELETE,value="/greetings/{id}")
    public void deleteGreeting(@PathVariable String id){
        greetingServiceImpl.deleteGreetingByLanguage(id);
    }

    /**
     * Retrieve all greetings Based on language
     * @param langId
     * @return
     */

    @RequestMapping("/languages/{langId}/greetings")
    public List<GreetingModel> getAllGreetingsByLanguage(@PathVariable String langId){
        return greetingServiceImpl.getAllGreetingsByLanguage(langId);
    }

    /**
     * Retrieve particular greetings by language
     * @param langId
     * @param id
     * @return
     */
    @RequestMapping("/languages/{langId}/greetings/{id}")
    public GreetingModel getGreetingByLanguage(@PathVariable String langId, @PathVariable String id){
        return greetingServiceImpl.getGreetingByLanguage(id);
    }

    /**
     * Add new greeting to language
     * @param greeting
     * @param langId
     */

    /**
     *
     * @param greetingModel
     * @param langId
     */
    @RequestMapping(method = RequestMethod.POST,value="/languages/{langId}/greetings")
    public void addGreetingByLanguage(@RequestBody GreetingModel greetingModel, @PathVariable String langId){
        greetingModel.setLanguageModel(new LanguageModel(langId));
        greetingServiceImpl.addGreetingByLanguage(greetingModel);
    }

    /**
     * Update the GreetingModel from LanguageModel if not present add it
     * @param greetingModel
     * @param langId
     * @param id
     */

    @RequestMapping(method = RequestMethod.PUT,value="/languages/{langId}/greetings/{id}")
    public void updateGreetingByLanguage(@RequestBody GreetingModel greetingModel, @PathVariable String langId, @PathVariable String id){
        greetingModel.setLanguageModel(new LanguageModel(langId));
        greetingServiceImpl.updateGreetingByLanguage(greetingModel,id);
    }

    /**
     * Delete greeting from language
     * @param id
     */

    @RequestMapping(method = RequestMethod.DELETE,value="/languages/{langId}/greetings/{id}")
    public void deleteGreetingByLanguage(@PathVariable String id){
        greetingServiceImpl.deleteGreetingByLanguage(id);
    }
}
