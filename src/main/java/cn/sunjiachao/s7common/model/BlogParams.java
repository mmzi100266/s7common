package cn.sunjiachao.s7common.model;

/**
 * 博客其他属性

 */
public class BlogParams {
    private int blogParamId;
    private String postIp;
    private int commentCount;
    private int blogId;

    public int getBlogParamId() {
        return blogParamId;
    }

    public void setBlogParamId(int blogParamId) {
        this.blogParamId = blogParamId;
    }

    public String getPostIp() {
        return postIp;
    }

    public void setPostIp(String postIp) {
        this.postIp = postIp;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }
}
