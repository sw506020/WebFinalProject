package org.wws.entity.post;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by weiweisu on 3/18/14.
 */
@Entity
@Table(name="POST")
public class Post {
    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="title")
    private String title;
    @Column(name="postDate")
    private Date postDate;
    @Column(name="likes")
    private int like;

    @OneToMany(mappedBy="post", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PhotoUrl> photosUrl;

    @Column(name="description")
    private String desc;


    public Post() {}

    public Post(String title, Date postDate, int like, String desc) {
        this.desc=desc;
        this.like=like;
        this.postDate=postDate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<PhotoUrl> getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(List<PhotoUrl> photosUrl) {
        this.photosUrl = photosUrl;
    }
}
