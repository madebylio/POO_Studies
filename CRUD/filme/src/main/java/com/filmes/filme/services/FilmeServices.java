package com.filmes.filme.services;

import com.filmes.filme.models.FilmeModel;
import com.filmes.filme.repositories.FilmeRepositoriy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeServices {

    @Autowired
    private FilmeRepositoriy filmeRepositoriy;

    public List<FilmeModel> findAll(){
        return filmeRepositoriy.findAll();
    }

    public FilmeModel criarFilme(FilmeModel filmeModel){
        return filmeRepositoriy.save(filmeModel);
    }


}
