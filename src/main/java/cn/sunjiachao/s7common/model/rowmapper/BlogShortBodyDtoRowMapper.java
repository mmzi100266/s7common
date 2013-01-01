package cn.sunjiachao.s7common.model.rowmapper;


import cn.sunjiachao.s7common.model.dto.BlogShortBodyDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BlogShortBodyDtoRowMapper implements RowMapper<BlogShortBodyDto> {
    @Override
    public BlogShortBodyDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        BlogShortBodyDto bd = new BlogShortBodyDto();
        bd.setBlogId(resultSet.getInt("blogId"));
        bd.setTitle(resultSet.getString("title"));
        bd.setShortBody(resultSet.getString("shortBody"));
        bd.setCreateTime(resultSet.getDate("createTime"));
        bd.setLoginName(resultSet.getString("loginName"));
        return bd;
    }
}
