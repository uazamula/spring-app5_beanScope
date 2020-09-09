package ua.org.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Sonate 17";
    }
}
