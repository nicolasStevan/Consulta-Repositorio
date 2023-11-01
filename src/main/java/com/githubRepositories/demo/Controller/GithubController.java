package com.githubRepositories.demo.Controller;


import com.githubRepositories.demo.GithubRepository.GithubRepositoryDTO;
import com.githubRepositories.demo.Services.GithubServices;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class GithubController {

    private final GithubServices githubService;

    public GithubController(GithubServices githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/git")
    public GithubRepositoryDTO[] consultaGit(@RequestParam String username) {
        System.out.println("Solicitação Chegou aqui " + username);
       /*
       return githubService.consultaGit(username);
        */
        GithubRepositoryDTO[] result = githubService.consultaGit(username);

        System.out.println("Dados consultados: " + Arrays.toString(result));
        return result;
    }
}

