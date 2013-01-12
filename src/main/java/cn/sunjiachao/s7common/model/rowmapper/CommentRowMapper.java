package cn.sunjiachao.s7common.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.sunjiachao.s7common.model.Comment;

public class CommentRowMapper implements RowMapper<Comment> {
	@Override
	public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comment comment = new Comment();
		comment.setCid(rs.getInt("cid"));
		comment.setGuestName(rs.getString("guestName"));
		comment.setBody(rs.getString("body"));
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// comment.setCreateTime(new
		// Date(sdf.format(rs.getTimestamp("createTime"))));
		comment.setCreateTime(rs.getTimestamp("createTime"));
		// System.out.println(rs.getTimestamp("createTime"));
		comment.setBelongTo(rs.getInt("belongTo"));
		return comment;
	}
}
