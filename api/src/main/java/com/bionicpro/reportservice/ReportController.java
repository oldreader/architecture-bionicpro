package com.bionicpro.reportservice;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ReportController {

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping("/reports")
    @PreAuthorize("hasAuthority('prothetic_user')")
    public String get() {
        return "reports";
    }

}
