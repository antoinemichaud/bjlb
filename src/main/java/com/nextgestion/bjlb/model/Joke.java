package com.nextgestion.bjlb.model;

public class Joke {

    public enum Category {
        REGULAR,
        BAD
    }

    private String authorName;

    private String authorMail;

    private Category category;

    private String publicationDate;

    private String mainContent;

    public Joke(String authorName, String authorMail, Category category, String publicationDate, String mainContent) {
        this.authorName = authorName;
        this.authorMail = authorMail;
        this.category = category;
        this.publicationDate = publicationDate;
        this.mainContent = mainContent;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorMail() {
        return authorMail;
    }

    public void setAuthorMail(String authorMail) {
        this.authorMail = authorMail;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }
}
