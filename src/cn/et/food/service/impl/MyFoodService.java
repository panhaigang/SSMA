package cn.et.food.service.impl;

import java.util.List;
import java.util.Map;

public interface MyFoodService {

	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#queryAllFood(java.lang.String)
	 */
	public abstract List<Map<String, Object>> queryAllFood(String foodname);

	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#deleteFood(java.lang.String)
	 */
	public abstract void deleteFood(String foodid);

	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#saveFood(java.lang.String, java.lang.String)
	 */
	public abstract void saveFood(String foodname, String price);

	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyFoodService#updateFood(java.lang.String, java.lang.String, java.lang.String)
	 */
	public abstract void updateFood(String foodid, String foodname, String price);

}