package com.reservation.controllers;

import com.reservation.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @PostMapping("/track")
    public ResponseEntity<Void> trackVisitor(@RequestBody String visitorId) {
        visitorService.trackVisitor(visitorId);
        return ResponseEntity.ok().build();
    }
}
