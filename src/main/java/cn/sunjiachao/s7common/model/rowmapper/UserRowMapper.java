package cn.sunjiachao.s7common.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.sunjiachao.s7common.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int i) throws SQLException {
		User user = new User();
		user.setUid(rs.getInt("uid"));
		user.setLoginName(rs.getString("loginName"));
		user.setPassword(rs.getString("password"));
		user.setCreateTime(rs.getDate("createTime"));
		return user;
	}

}
