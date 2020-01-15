package model.dao;

import db.DB;
import model.dao.impl.CountryDaoJDBC;

public class DaoFactory {

	public static CountryDao createCountryDao() {
		return new CountryDaoJDBC(DB.getConnection());
	}
}
