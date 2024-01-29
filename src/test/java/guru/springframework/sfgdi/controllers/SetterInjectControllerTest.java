package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstractorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectControllerTest {

    SetterInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectController();
        controller.setGreetingService(new ConstractorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}