package cn.et.food.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.food.dao.MyFoodDao;
import cn.et.food.service.impl.MyFoodService;

@Repository
public class MyFoodServiceImpl implements MyFoodService {
	@Autowired
	MyFoodDao dao;
	
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#queryAllFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#queryAllFood(java.lang.String)
	 */
	public List<Map<String, Object>> queryAllFood(String foodname){
		return dao.queryAllFood(foodname);
	}
	
	
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#deleteFood(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodid){
		dao.deleteFood(foodid);
	}
	
	
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#saveFood(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#saveFood(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodname,String price){
		dao.saveFood(foodname, price);
	}
	
	
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodid,String foodname,String price){
		dao.updateFood(foodid, foodname, price);
	}
}