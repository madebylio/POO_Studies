package com.filmes.filme.repositories;

import com.filmes.filme.models.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepositoriy extends JpaRepository<FilmeModel, Long> {



}
