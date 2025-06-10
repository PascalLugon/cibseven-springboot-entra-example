package org.cibseven.examples.springboot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @PreAuthorize("isAuthenticated()")
    @GetMapping(
            value = "test"
    )
    public String test() {
        return "Hello CIB Seven!";
    }

}
