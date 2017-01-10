package service.manage.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import dao.bean.manageblog.Category;
import dao.manage.CategoryDao;
import dao.manage.impl.CategoryDaoImpl;
import service.manage.ManageBlogService;

public class ManageBlogServiceImpl implements ManageBlogService {

	private static ManageBlogServiceImpl instance;
	SqlSessionFactory sqlSessionFactory = null;
	private CategoryDao categoryDao;
	
	public static ManageBlogServiceImpl getInstance() {
		if(instance == null) {
			synchronized(ManageBlogServiceImpl.class) {
				if(instance == null) {
					instance = new ManageBlogServiceImpl();
				}
			}
		}
		return instance;
	}
	
	private ManageBlogServiceImpl() {
		categoryDao = new CategoryDaoImpl();
	}
	
	@Override
	public List<Category> getCategorys() {
		// TODO Auto-generated method stub
		return categoryDao.getCategorys();
	}
	

}
