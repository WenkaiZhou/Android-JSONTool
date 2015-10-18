package com.kevin.jsontool;

import android.app.Activity;
import android.os.Bundle;

import com.kevin.jsontool.bean.TestBean1;
import com.kevin.jsontool.bean.TestBean2;
import com.kevin.jsontool.bean.TestBean3;
import com.kevin.jsontool.utils.LocalFileUtils;
/**
 * 版权所有：XXX有限公司</br>
 * 
 * MainActivity </br>
 * 
 * @author zhou.wenkai ,Created on 2015-10-9 17:37:18</br> 
 * 		   Major Function：<b>JSON 操作 工具类测试</b> </br>
 * 
 *         注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！</br>
 * @author mender，Modified Date Modify Content:
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String json = LocalFileUtils.getStringFormAsset(this, "testbean1.json");
		
//		jsonParseTest1();
//		jsonParseTest2();
		
//		jsonParseTest3();
		
//		createBeanTest1();
		createBeanTest2();
//		createBeanTest3();
	}

	private void createBeanTest1() {
		String json = LocalFileUtils.getStringFormAsset(this, "testbean1.json");
		String createBean = JsonTool.createBean(json, "TestBean1");
		System.out.println(createBean);
	}
	
	private void createBeanTest2() {
		String json = LocalFileUtils.getStringFormAsset(this, "testbean2.json");
		String createBean = JsonTool.createBean(json, "TestBean2");
		System.out.println(createBean);
	}
	
	private void createBeanTest3() {
		String json = LocalFileUtils.getStringFormAsset(this, "testbean3.json");
		String createBean = JsonTool.createBean(json, "TestBean3");
		System.out.println(createBean);
	}

	private void jsonParseTest1() {
		String json = LocalFileUtils.getStringFormAsset(this, "testbean1.json");
		// 使用JSON 操作 工具将JSON字符串封装到实体类
		TestBean1 toBean = JsonTool.toBean(json, TestBean1.class);
		System.out.println(toBean);
		
		String toJson = JsonTool.toJson(toBean);
		System.out.println(toJson);
	}
	
	private void jsonParseTest2() {
		String json = LocalFileUtils.getStringFormAsset(this, "testbean2.json");
		// 使用JSON 操作 工具将JSON字符串封装到实体类
		TestBean2 toBean = JsonTool.toBean(json, TestBean2.class);
		System.out.println(toBean);
		
		String toJson = JsonTool.toJson(toBean);
		System.out.println(toJson);
	}
	
	private void jsonParseTest3() {
		String json = LocalFileUtils.getStringFormAsset(this, "testbean3.json");
		// 使用JSON 操作 工具将JSON字符串封装到实体类
		TestBean3 toBean = JsonTool.toBean(json, TestBean3.class);
		System.out.println(toBean);
		
		String toJson = JsonTool.toJson(toBean);
		System.out.println(toJson);
		toBean = JsonTool.toBean(toJson, TestBean3.class);
		System.out.println(toBean);
	}

}
