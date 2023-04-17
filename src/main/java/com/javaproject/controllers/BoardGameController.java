package com.javaproject.controllers;

import java.net.URI;
import java.util.List;

import org.hibernate.boot.model.relational.Database;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.javaproject.beans.ErrorMessage;
import com.javaproject.beans.Review;
import com.javaproject.database.DatabaseAccess;

// special type of controller that is specialized for REST purpose. It marshals our domain objects to and from json
@RestController
@RequestMapping("/reviews")
public class BoardGameController {

    private DatabaseAccess da;

    public BoardGameController(DatabaseAccess da) {
        this.da = da;
    }

    // @GetMapping("/{id}")
    // public List<Review> getReviews(@PathVariable Long boardgameId) {
    // List<Review> reviews = da.getReviews(boardgameId);
    // return reviews;
    // }
}