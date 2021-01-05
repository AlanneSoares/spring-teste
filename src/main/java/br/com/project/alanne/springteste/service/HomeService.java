package br.com.project.alanne.springteste.service;

import br.com.project.alanne.springteste.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private HomeRepository homeRepository;

    public void salvar(Contato contato) {
        homeRepository.save(contato);
    }

    public void deletar() {

    }

    public void editar() {

    }
}
