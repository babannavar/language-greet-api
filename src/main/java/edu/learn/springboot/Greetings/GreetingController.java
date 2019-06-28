package edu.learn.springboot.Greetings;

import edu.learn.springboot.language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

@Autowired
GreetingService greetingService;


    /**
     * Retrieve all greetings
     * @return
     */
    @RequestMapping("/greetings")
    public List<Greeting> getAllGreetings(){
        return greetingService.getAllGreetings();
    }

    /**
     * Retrieve particular greetings
     * @param id
     * @return
     */

    @RequestMapping("/greetings/{id}")
    public Greeting getGreeting(@PathVariable String id){
        return greetingService.getGreeting(id);
    }

    /**
     * Add new greeting
     * @param greeting
     */

    @RequestMapping(method = RequestMethod.POST,value="/greetings")
    public void addGreeting(@RequestBody Greeting greeting){
        greetingService.addGreeting(greeting);
    }

    /**
     * Update the Greeting if not present add it
     * @param greeting
     * @param id
     */
    @RequestMapping(method = RequestMethod.PUT,value="/greetings/{id}")
    public void updateGreeting(@RequestBody Greeting greeting, @PathVariable String id){
          greetingService.updateGreeting(greeting,id);
    }

    /**
     * Delete greeting
     * @param id
     */

    @RequestMapping(method = RequestMethod.DELETE,value="/greetings/{id}")
    public void deleteGreeting(@PathVariable String id){
        greetingService.deleteGreetingByLanguage(id);
    }

    /**
     * Retrieve all greetings Based on language
     * @param langId
     * @return
     */

    @RequestMapping("/languages/{langId}/greetings")
    public List<Greeting> getAllGreetingsByLanguage(@PathVariable String langId){
        return greetingService.getAllGreetingsByLanguage(langId);
    }

    /**
     * Retrieve particular greetings by language
     * @param langId
     * @param id
     * @return
     */
    @RequestMapping("/languages/{langId}/greetings/{id}")
    public Greeting getGreetingByLanguage(@PathVariable String langId, @PathVariable String id){
        return greetingService.getGreetingByLanguage(id);
    }

    /**
     * Add new greeting to language
     * @param greeting
     * @param langId
     */

    @RequestMapping(method = RequestMethod.POST,value="/languages/{langId}/greetings")
    public void addGreetingByLanguage(@RequestBody Greeting greeting, @PathVariable String langId){
        greeting.setLanguage(new Language(langId));
        greetingService.addGreetingByLanguage(greeting);
    }

    /**
     * Update the Greeting from Language if not present add it
     * @param greeting
     * @param langId
     * @param id
     */

    @RequestMapping(method = RequestMethod.PUT,value="/languages/{langId}/greetings/{id}")
    public void updateGreetingByLanguage(@RequestBody Greeting greeting,@PathVariable String langId, @PathVariable String id){
        greeting.setLanguage(new Language(langId));
        greetingService.updateGreetingByLanguage(greeting,id);
    }

    /**
     * Delete greeting from language
     * @param id
     */

    @RequestMapping(method = RequestMethod.DELETE,value="/languages/{langId}/greetings/{id}")
    public void deleteGreetingByLanguage(@PathVariable String id){
        greetingService.deleteGreetingByLanguage(id);
    }
}
