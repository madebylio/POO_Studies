package com.filmes.filme.controllers;

import com.filmes.filme.models.FilmeModel;
import com.filmes.filme.services.FilmeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/filmes")
public class FilmeController {

    @Autowired
    private FilmeServices filmeServices;

    @GetMapping
    private ResponseEntity<List<FilmeModel>> findAll(){
        List <FilmeModel> response = filmeServices.findAll();
        return ResponseEntity.ok().body(response);
    }
    @PostMapping
    private ResponseEntity<FilmeModel> criarFilme(@RequestBody FilmeModel filmeModel){
        FilmeModel response = filmeServices.criarFilme(filmeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
