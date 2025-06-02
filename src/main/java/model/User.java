package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String nickname;
    private boolean muted;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Folder> folders = new ArrayList<>();

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private List<Article> sendArticles = new ArrayList<>();

    @ManyToMany
    private List<Article> likedArticles = new ArrayList<>();

    @ManyToMany
    private List<Article> browsingHistory = new ArrayList<>();
    
    // 添加无参构造方法
    public User() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public boolean isMuted() { return muted; }
    public void setMuted(boolean muted) { this.muted = muted; }

    public List<Folder> getFolders() { return folders; }
    public void setFolders(List<Folder> folders) { this.folders = folders; }

    public List<Article> getSendArticles() { return sendArticles; }
    public void setSendArticles(List<Article> sendArticles) { this.sendArticles = sendArticles; }

    public List<Article> getLikedArticles() { return likedArticles; }
    public void setLikedArticles(List<Article> likedArticles) { this.likedArticles = likedArticles; }

    public List<Article> getBrowsingHistory() { return browsingHistory; }
    public void setBrowsingHistory(List<Article> browsingHistory) { this.browsingHistory = browsingHistory; }
}
