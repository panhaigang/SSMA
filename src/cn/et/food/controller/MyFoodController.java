package cn.et.food.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.food.service.impl.MyFoodService;

@Controller
public class MyFoodController {
	@Autowired
	MyFoodService mdi;
	//��ѯ
	/**
	 * ֱ�ӷ���һ������
	 */
	@ResponseBody
	@RequestMapping(value="/queryFoodList",method=RequestMethod.GET)
	public List<Map<String, Object>> queryFoodList(String foodname) throws UnsupportedEncodingException, IOException{
		List<Map<String, Object>> queryAllFood = mdi.queryAllFood(foodname);
		return queryAllFood;
	}
	
	//ɾ��
	@RequestMapping(value="/deleteFood/{foodid}",method=RequestMethod.DELETE)
	public String deleteFood(@PathVariable String foodid, OutputStream os) throws
		UnsupportedEncodingException,IOException{
			try{
				mdi.deleteFood(foodid);
				os.write("1".getBytes("UTF-8"));
			}catch(Exception e){
				os.write("0".getBytes("UTF-8"));
			}
			return null;
	}
	
	
	//�޸�
	@RequestMapping(value="/updateFood/{foodid}",method=RequestMethod.PUT)
	public String updateFood(@PathVariable String foodid,String foodname,String price, OutputStream os) throws UnsupportedEncodingException, IOException{
		try{
			mdi.updateFood(foodid, foodname, price);
			//�����Դ����ɹ�
			os.write("1".getBytes("UTF-8"));
		}catch(Exception e){
			//����0����ʧ��
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	
	
	//����
	@RequestMapping(value="/saveFood",method=RequestMethod.POST)
	public String saveFood(String foodname,String price, OutputStream os) throws UnsupportedEncodingException, IOException{
		try{
			mdi.saveFood(foodname, price);
			os.write("1".getBytes("UTF-8"));
		}catch(Exception e){
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
}