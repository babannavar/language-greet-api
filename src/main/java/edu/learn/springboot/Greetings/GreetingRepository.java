package edu.learn.springboot.Greetings;


import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface GreetingRepository extends CrudRepository<Greeting,String> {

    /**
     * Added custom query to LangID from Language Table
     * @param id
     * @return
     */
    public List<Greeting> findByLanguageLangId(String id);
}
