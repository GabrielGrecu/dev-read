package com.dev.curs13.controller;

import com.dev.curs13.model.MathOps;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@RestController
public class HomeController {

    /**
     * Simply selects the home view to render by returning its name.
     */
    @GetMapping("/time")
    public String getCurrentTime(@RequestParam(required = false, defaultValue = "UTC") String timeZone) {
        ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(timeZone));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = currentTime.format(formatter);

        return "Ora curentă pentru fusul orar " + timeZone + ": " + formattedTime;
    }

    @GetMapping(value = "/about")
    public String add(){
        System.out.println("Numele este ");
        return "Gabi";
    }

    @GetMapping("/harry-potter")
    public String getHarryPotterCharacter() {
        Faker faker = new Faker();
        String characterName = faker.harryPotter().character();
        return "Personajul din universul Harry Potter: " + characterName;
    }

    @PostMapping("/math-service")
    public double performMathOperation(@RequestBody MathOps request) {

        return request.mathOperation(request.getFirstNumber(), request.getSecondNumber(), request.getOperation());
    }
}
