package org.wecancoeit.reviews;


//gather all items:
public class Review {
    private Long id;
    private String title;
    private String category;
    private String content;
    private String image;


    //getter created from course repository
    public Long getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }

    //constructor
    public Review(long id, String title, String category, String content, String image) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.content = content;
        this.image = image;

    }

}
