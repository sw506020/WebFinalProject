package org.wws.entity.post;

import javax.persistence.*;

/**
 * Created by weiweisu on 3/20/14.
 */
@Entity
@Table(name="PHOTOURL")
public class PhotoUrl {
    @Id
    @Column(name = "photo_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="url")
    private String url;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="fk_post_photo")
    private Post post;

    public PhotoUrl() {}

    public PhotoUrl(String url) {
        this.url = url;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
