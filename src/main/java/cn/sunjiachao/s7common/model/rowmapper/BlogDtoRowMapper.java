package cn.sunjiachao.s7common.model.rowmapper;


import cn.sunjiachao.s7common.model.dto.BlogDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BlogDtoRowMapper implements RowMapper<BlogDto> {
    @Override
    public BlogDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        BlogDto bd = new BlogDto();
        bd.setBlogId(resultSet.getInt("blogId"));
        bd.setTitle(resultSet.getString("title"));
        bd.setShortBody(resultSet.getString("shortBody"));
        bd.setCreateTime(resultSet.getDate("createTime"));
        bd.setLoginName(resultSet.getString("loginName"));
        return bd;
    }
}
