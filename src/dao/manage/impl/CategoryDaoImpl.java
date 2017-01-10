package dao.manage.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import util.MyBatisUtil;
import dao.bean.manageblog.Category;
import dao.bean.user.User;
import dao.manage.CategoryDao;
import dao.mappers.AddBlogMapper;
import dao.mappers.UserMapper;

public class CategoryDaoImpl implements CategoryDao {

	SqlSessionFactory sqlSessionFactory = null;
	
	public CategoryDaoImpl() {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}
	
	@Override
	public List<Category> getCategorys() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            AddBlogMapper addBlogMapper = sqlSession.getMapper(AddBlogMapper.class);
            List<Category> categoryList = addBlogMapper.getCategorys();
            return categoryList;
        } finally {
            sqlSession.close();
        }
	}
   
}
