package edu.learn.springboot.Greetings;

import java.util.List;

public interface GreetingService {

    public List<GreetingModel> getAllGreetings();

    public GreetingModel getGreeting(String id);

    public void addGreeting(GreetingModel greetingModel);

    public void updateGreeting(GreetingModel greetingModel, String id);

    public void deleteGreeting(String id);

    public List<GreetingModel> getAllGreetingsByLanguage(String id);

    public GreetingModel getGreetingByLanguage(String id);

    public void addGreetingByLanguage(GreetingModel greetingModel);

    public void updateGreetingByLanguage(GreetingModel greetingModel, String id);

    public void deleteGreetingByLanguage(String id);


}
