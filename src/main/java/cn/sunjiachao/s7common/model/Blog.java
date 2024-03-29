package cn.sunjiachao.s7common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 博客实体
 */
public class Blog implements Serializable {

	private static final long serialVersionUID = -2016855980107112860L;
	
	private int blogId;
	private String title;
	private String body;
	private String shortBody;
	private Date createTime;
	private Date updateTime;
	private int createUser;

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getTitle() {
		return title;
	}

	public String getShortBody() {
		return shortBody;
	}

	public void setShortBody(String shortBody) {
		this.shortBody = shortBody;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}
}
