package cn.sunjiachao.s7common.model;

import java.util.Date;

/**
 * 留言实体
 */
public class Comment {

	private int cid;
	private String guestName;
	private String body;
	private Date createTime;
	private int belongTo;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	public int getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(int belongTo) {
		this.belongTo = belongTo;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
}
