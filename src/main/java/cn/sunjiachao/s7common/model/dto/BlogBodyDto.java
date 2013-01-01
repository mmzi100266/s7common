package cn.sunjiachao.s7common.model.dto;

import java.util.Date;

/**
 * sql: select b.blogId,b.title,b.body,b.createTime,u.loginName from s7_blog as b inner join s7_user as u where b.createUser = 1
 */
public class BlogBodyDto {

    private int blogId;
    private String title;
    private String body;
    private Date createTime;
    private String loginName;

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
