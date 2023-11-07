package io.github.tomaszpro99.digitalcookbook;

public class Recipe {
    private String title;
    private String author;
    private int likes;

    public Recipe(String title, String author, int likes) {
        this.title = title;
        this.author = author;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    public String getAuthorLikes() {
        return author + " | " + likes + " likes";
    }
}
