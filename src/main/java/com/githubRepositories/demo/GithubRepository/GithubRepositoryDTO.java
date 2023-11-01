package com.githubRepositories.demo.GithubRepository;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubRepositoryDTO {

    private String login;
    private int id;
    private String url;
    private String html_url;
    private String repos_url;
    private String name;
    private String full_name;
    @JsonProperty("private")
    private boolean myprivate;
    private String description;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public boolean isMyprivate() {
        return myprivate;
    }

    public void setMyprivate(boolean myprivate) {
        this.myprivate = myprivate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
/*{
     "id": 668913524,
    "name": "adivinhe-a-palavra",
    "full_name": "nicolasStevan/adivinhe-a-palavra",
    "private": false,
    "owner":
      "login": "nicolasStevan",
      "id": 106289677,
      "repos_url": "https://api.github.com/users/nicolasStevan/repos",
      "html_url": "https://github.com/nicolasStevan/adivinhe-a-palavra",
       "description": null,
 */

}
