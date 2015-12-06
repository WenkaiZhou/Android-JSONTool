package com.kevin.jsontool.sample.bean;

import java.util.List;
/**
 * 版权所有：XXX有限公司</br>
 * 
 * MainActivity </br>
 * 
 * @author zhou.wenkai ,Created on 2015-10-9 15:38:12</br> 
 * 		   Major Function：<b>JSON 操作 工具类测试实体对象</b> </br>
 * 
 *         注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！</br>
 * @author mender，Modified Date Modify Content:
 */
public class TestBean3 {
	public List<NewsItem> data;

	public class NewsItem {
		public int id;
		public String title;
		public int type;
		public String url;
		public String url1;
		public String dayurl;
		public String excurl;
		public String weekurl;
	}

}