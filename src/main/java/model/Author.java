package model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Author {

    private String name;
    private String affiliation;
    private String googleScholarUrl;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAffiliation() { return affiliation; }
    public void setAffiliation(String affiliation) { this.affiliation = affiliation; }

    public String getGoogleScholarUrl() { return googleScholarUrl; }
    public void setGoogleScholarUrl(String googleScholarUrl) { this.googleScholarUrl = googleScholarUrl; }
}
