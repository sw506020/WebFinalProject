package org.wws.entity.post;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by weiweisu on 3/18/14.
 */
@Entity
@Table(name="COMMENT")
public class Comment {
    @Id
    @Column(name = "comment_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="userName")
    private String userName;
    @Column(name="commentDate")
    private Date commentDate;
    @Column(name="content")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="fk_post")
    private Post post;

    public Comment() {}

    public Comment(String userName, String content, Date commentDate, Post post) {
        this.content=content;
        this.userName=userName;
        this.commentDate=commentDate;
        this.post=post;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
