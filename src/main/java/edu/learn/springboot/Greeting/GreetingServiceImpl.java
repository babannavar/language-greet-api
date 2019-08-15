package edu.learn.springboot.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingServiceImpl  implements GreetingService{

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public List<GreetingModel> getAllGreetings() {
        List<GreetingModel> languages = new ArrayList<GreetingModel>();
        greetingRepository.findAll().forEach(languages::add);
        return languages;
    }

    @Override
    public GreetingModel getGreeting(String id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public void addGreeting(GreetingModel greetingModel) {
        greetingRepository.save(greetingModel);
    }

    @Override
    public void updateGreeting(GreetingModel greetingModel, String id) {
        greetingRepository.save(greetingModel);
    }

    @Override
    public void deleteGreeting(String id) {
        greetingRepository.deleteById(id);
    }

    @Override
    public List<GreetingModel> getAllGreetingsByLanguage(String id) {
        List<GreetingModel> greetingModels = new ArrayList<GreetingModel>();
        greetingRepository.findByLanguageModelLangId(id).forEach(greetingModels::add);
        return greetingModels;
    }

    @Override
    public GreetingModel getGreetingByLanguage(String id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public void addGreetingByLanguage(GreetingModel greetingModel) {
        greetingRepository.save(greetingModel);
    }

    @Override
    public void updateGreetingByLanguage(GreetingModel greetingModel, String id) {
        greetingRepository.save(greetingModel);
    }

    @Override
    public void deleteGreetingByLanguage(String id) {
       greetingRepository.deleteById(id);
    }


}
