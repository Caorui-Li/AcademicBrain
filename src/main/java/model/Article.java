package model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Article {

    @Id
    private String id;

    private String title;
    private String summary;
    private String contentUrl;
    private int views;
    private int citations;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    @Embedded
    private Author author;

    @ManyToOne
    private User sender;
    
    // 添加无参构造方法
    public Article() {}

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public String getContentUrl() { return contentUrl; }
    public void setContentUrl(String contentUrl) { this.contentUrl = contentUrl; }

    public int getViews() { return views; }
    public void setViews(int views) { this.views = views; }

    public int getCitations() { return citations; }
    public void setCitations(int citations) { this.citations = citations; }

    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public User getSender() { return sender; }
    public void setSender(User sender) { this.sender = sender; }
}
