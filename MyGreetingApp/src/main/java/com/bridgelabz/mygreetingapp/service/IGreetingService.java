package com.bridgelabz.mygreetingapp.service;


import com.bridgelabz.mygreetingapp.model.Greeting;
import com.bridgelabz.mygreetingapp.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    List<Greeting> getAllGreetings();
    Greeting editGreeting(Greeting greeting);
    String deleteMessageById(long id);
}
