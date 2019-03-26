package com.exoscale.syslog.micronaut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BarController.class);

    private final Bar bar;

    public BarController(Bar bar) {
        this.bar = bar;
    }

    @GetMapping("/")
    public ResponseEntity<?> root() {
        LOGGER.info(bar.bar());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}