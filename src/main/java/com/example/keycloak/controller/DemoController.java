package com.example.keycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author narendra.waykos
 * @version $Id: DemoController.java, v 0.1 2024-04-03 6:55 PM narendra.waykos $$
 */
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("user")
    @PreAuthorize("hasRole('user')")
    public String user() {
        return "Hello from User API";
    }

    @GetMapping("admin")
    @PreAuthorize("hasRole('admin')")
    public String admin() {
        return "Hello from Admin API";
    }
}
