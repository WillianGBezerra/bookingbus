package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.CountryDao;
import model.entities.Country;

public class CountryDaoJDBC implements CountryDao {

	private Connection conn;

	public CountryDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Country obj) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("INSERT INTO country " + "(Name, AcronymCountry) " + "VALUES " + "(?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getName());
			st.setString(2, obj.getAcronymCountry());
			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void update(Country obj) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("UPDATE country " + "SET Name = ?, AcronymCountry = ? " + "WHERE Id = ?");
			st.setString(1, obj.getName());
			st.setString(2, obj.getAcronymCountry());
			st.setInt(3, obj.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM country WHERE Id = ?", Statement.RETURN_GENERATED_KEYS);
			st.setInt(1, id);
			int rowsAffected = st.executeUpdate();
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {

				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public Country findByName(String name) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM country " + "WHERE Name = ? " + "ORDER BY Name");
			st.setString(1, name);
			rs = st.executeQuery();
			if (rs.next()) {
				Country obj = instantiateCountry(rs);
				return obj;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public Country findById(Integer id) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM country " + "WHERE Id = ? " + "ORDER BY Name");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Country obj = instantiateCountry(rs);
				return obj;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Country> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private Country instantiateCountry(ResultSet rs) throws SQLException {
		Country obj = new Country();
		obj.setId(rs.getInt("Id"));
		obj.setName(rs.getString("Name"));
		obj.setAcronymCountry(rs.getString("AcronymCountry"));
		return obj;
	}

}
