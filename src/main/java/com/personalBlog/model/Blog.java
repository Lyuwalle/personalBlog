package com.personalblog.model;

/**
 * @Author lyuWalle
 * @Date 2020/5/6 0:25
 * @Version 1.0
 */
public class Blog {
    private int blogid;
    private String blogtitle;
    private String article;
    private String time;

    public int getBlogid() {
        return blogid;
    }

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public String getBlogtitle() {
        return blogtitle;
    }

    public void setBlogtitle(String blogtitle) {
        this.blogtitle = blogtitle;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
