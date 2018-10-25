package com.sample.mybatisspring.ibatis.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import com.sample.mybatisspring.domain.ActiveStatus;

/**
 * Custom type handlers implementation to retrieve a value from a ResultSet into
 * a {@link ActiveStatus}
 * 
 * @author <a href="mailto:mauricionrgarcia@gmail.com">Mauricio Garcia</a>
 * @version
 * @sinse 21/10/2018 21:50:17
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
public class ActiveStatusTypeHandler extends BaseTypeHandler<ActiveStatus> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, ActiveStatus parameter, JdbcType jdbcType)
			throws SQLException {
		if (jdbcType == null) {
			ps.setString(i, parameter.getDbCode());
		} else {
			ps.setObject(i, parameter.getDbCode(), jdbcType.TYPE_CODE); // see r3589
		}
	}

	@Override
	public ActiveStatus getNullableResult(ResultSet rs, String columnName) throws SQLException {
		String s = rs.getString(columnName);
		return s == null ? null : ActiveStatus.getFromDb(s);
	}

	@Override
	public ActiveStatus getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		String s = rs.getString(columnIndex);
		return s == null ? null : ActiveStatus.getFromDb(s);
	}

	@Override
	public ActiveStatus getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		String s = cs.getString(columnIndex);
		return s == null ? null : ActiveStatus.getFromDb(s);
	}

}