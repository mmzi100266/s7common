package cn.sunjiachao.s7common.model.rowmapper;


import cn.sunjiachao.s7common.model.dto.BlogBodyDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BlogBodyDtoRowMapper implements RowMapper<BlogBodyDto> {
    @Override
    public BlogBodyDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        BlogBodyDto bd = new BlogBodyDto();
        bd.setBlogId(resultSet.getInt("blogId"));
        bd.setTitle(resultSet.getString("title"));
        bd.setBody(resultSet.getString("body"));
        bd.setCreateTime(resultSet.getDate("createTime"));
        bd.setLoginName(resultSet.getString("loginName"));
        return bd;
    }
}
