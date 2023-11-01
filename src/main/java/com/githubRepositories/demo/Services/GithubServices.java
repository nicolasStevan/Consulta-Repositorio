package com.githubRepositories.demo.Services;

import com.githubRepositories.demo.GithubRepository.GithubRepositoryDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubServices {

    private final RestTemplate restTemplate;
    private static final String GITHUB_API_URL = "https://api.github.com";

    @Autowired
    public GithubServices(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GithubRepositoryDTO[] consultaGit(String git) {
        String apiUrl = GITHUB_API_URL + "/users/" + git + "/repos";
        ResponseEntity<GithubRepositoryDTO[]> responseEntity = restTemplate.getForEntity(apiUrl, GithubRepositoryDTO[].class);
        return responseEntity.getBody();
    }
}
