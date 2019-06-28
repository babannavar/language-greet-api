package edu.learn.springboot.Greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;


    public List<Greeting> getAllGreetings() {
        List<Greeting> languages = new ArrayList<Greeting>();
        greetingRepository.findAll().forEach(languages::add);
        return languages;
    }

    public Greeting getGreeting(String id) {
        return greetingRepository.findById(id).get();
    }

    public void addGreeting(Greeting greeting) {
        greetingRepository.save(greeting);
    }

    public void updateGreeting(Greeting greeting, String id) {
        greetingRepository.save(greeting);
    }

    public void deleteGreeting(String id) {
        greetingRepository.deleteById(id);
    }

    public List<Greeting> getAllGreetingsByLanguage(String id) {
        List<Greeting> greetings = new ArrayList<Greeting>();
        greetingRepository.findByLanguageLangId(id).forEach(greetings::add);
        return greetings;
    }

    public Greeting getGreetingByLanguage(String id) {
        return greetingRepository.findById(id).get();
    }

    public void addGreetingByLanguage(Greeting greeting) {
        greetingRepository.save(greeting);
    }

    public void updateGreetingByLanguage(Greeting greeting, String id) {
        greetingRepository.save(greeting);
    }

    public void deleteGreetingByLanguage(String id) {
       greetingRepository.deleteById(id);
    }


}
