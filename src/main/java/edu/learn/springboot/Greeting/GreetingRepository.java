package edu.learn.springboot.Greeting;


import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface GreetingRepository extends CrudRepository<GreetingModel,String> {

    /**
     * Added custom query to l_Id from LanguageModel Table
     * @param id
     * @return
     */
    public List<GreetingModel> findByLanguageModelLangId(String id);
}
