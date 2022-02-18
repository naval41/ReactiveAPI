package com.baeldung.controller;


import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.entity.Result;

import reactor.core.publisher.Flux;

@RestController
public class ResourceController {

	@CrossOrigin(allowedHeaders = "*")
    @GetMapping(value = "/result", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Result> getResourceUsage() {

        Random random = new Random();

        return Flux.interval(Duration.ofSeconds(1))
                .map(it -> new Result(
                        random.nextInt(101),
                        random.nextInt(101),
                        new Date()));

    }
}
