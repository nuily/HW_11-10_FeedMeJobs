package nyc.c4q.huilin.feedmejobs.Pojos;

/**
 * Created by Akasha on 11/11/16.
 */

public class BuzzArticles {

    private String publishedAt;
    private String author;
    private String urlToImage;
    private String title;
    private String description;
    private String url;


    public String getPublishedAt () {
        return publishedAt;
    }

    public void setPublishedAt (String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getUrlToImage () {
        return urlToImage;
    }

    public void setUrlToImage (String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getUrl () {
        return url;
    }

    public void setUrl (String url) {
        this.url = url;
    }

//    @Override
//    public String toString() {
//        return "ClassPojo [publishedAt = "+publishedAt+", author = "+author+", urlToImage = "+urlToImage+", title = "+title+", description = "+description+", url = "+url+"]";
//    }

}