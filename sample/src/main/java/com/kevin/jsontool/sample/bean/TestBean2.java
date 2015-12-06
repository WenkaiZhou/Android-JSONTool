package com.kevin.jsontool.sample.bean;

import java.util.List;

/**
 * 版权所有：XXX有限公司</br>
 * 
 * AppConfig </br>
 * 
 * @author zhou.wenkai ,Created on 2015-6-8 11:04:31</br> 
 * @description Major Function：应用配置实体封装类 </br>
 * 
 *         注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！</br>
 * @author mender，Modified Date Modify Content:
 */
public class TestBean2 {

    /** 轮转图数据 */
    public LoopData rotateData;
    
    public class LoopData {
    	
    	/** 每个条目数据 */
    	public List<ItemDatas> items;
    	
    	public class ItemDatas {
    		/** ID */
    		public String id;
    		/** 图片地址 */
    		public String imgUrl;
    		/** 链接操作 */
    		public String link;
    		/** 描述信息 */
    		public String descText;
    		/** 类型 */
    		public String type;

    		public ItemDatas() {

    		}
    		
    		public ItemDatas(String id, String imgUrl, String link, String descText, String type) {
    			this.id = id;
    			this.imgUrl = imgUrl;
    			this.link = link;
    			this.descText = descText;
    			this.type = type;
    		}
    	}

    }
    
    public List<FunctionItem> functionItem;
    	public class FunctionItem {
    	public String id;
    	public String descText;
    	public String imgUrl;
    	public String target;
    }

    /** 服务地址 */
    public ServerUrl serverUrl;

    public class ServerUrl {
        /** 检测更新地址 */
        public String updateInfo;
    }


}
