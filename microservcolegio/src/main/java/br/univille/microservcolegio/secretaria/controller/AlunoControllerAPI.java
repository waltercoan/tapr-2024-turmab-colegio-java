package br.univille.microservcolegio.secretaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservcolegio.secretaria.entity.Aluno;
import br.univille.microservcolegio.secretaria.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoControllerAPI {
    
    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public ResponseEntity<Aluno> index(){
        var aluno = new Aluno();
        aluno.setNome("Zezinho");
        repository.save(aluno);
        return new ResponseEntity<Aluno>(aluno,HttpStatus.OK);
    }
}
