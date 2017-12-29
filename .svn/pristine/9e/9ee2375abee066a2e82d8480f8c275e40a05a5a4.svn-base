package cn.et.food.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.food.dao.MyFoodDao;
import cn.et.food.mapper.FoodMapper;

@Repository
public class MyFoodDaoImpl implements MyFoodDao {
	@Autowired
	FoodMapper fm;
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#queryAllFood(java.lang.String)
	 */
	public List<Map<String, Object>> queryAllFood(String foodname){
		return fm.queryAllFood(foodname);
	}
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#deleteFood(java.lang.String)
	 */
	public void deleteFood(String foodid){
		fm.deleteFood(foodid);
	}
		
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#saveFood(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodname,String price){
		fm.saveFood(foodname, price);
	}
	
	/* (non-Javadoc)
	 * @see cn.et.food.dao.impl.MyFoodDao#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodid,String foodname,String price){
		fm.updateFood(foodid, foodname, price);
	}
}
