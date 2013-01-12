package cn.sunjiachao.s7common.model.rowmapper;

import cn.sunjiachao.s7common.model.Comment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommentRowMapper implements RowMapper<Comment> {
    @Override
    public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
        Comment comment = new Comment();
        comment.setCid(rs.getInt("cid"));
        comment.setTitle(rs.getString("title"));
        comment.setBody(rs.getString("body"));
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        comment.setCreateTime(new Date(sdf.format(rs.getTimestamp("createTime"))));
        comment.setCreateTime(rs.getTimestamp("createTime"));
        comment.setBelongTo(rs.getInt("belongTo"));
        return comment;
    }
}
