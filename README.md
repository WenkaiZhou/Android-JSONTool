# Android-JSONTool

## How to use ##

**JSON to Bean Example**


	String jsonStr = LocalFileUtils.getStringFormAsset(this, "test.json");
	// 使用JSON 操作 工具将JSON字符串封装到实体类
	YourBean newsCenter = JsonTool.toBean(jsonStr, YourBean.class);

**Bean to JSON Example**

	// 使用JSON 操作 工具将实体类封装到JSON字符串
	String toJson = JsonTool.toJson(yourBean);

## 效率分析 ##

以实例中的数据`testbean1.json`为例进行**1000**次操作得到时间：

**测试代码**

	String json = LocalFileUtils.getStringFormAsset(this, "testbean1.json");
	
	long beginTime1 = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) {
		// 使用JSONTool 操作 工具将JSON字符串封装到实体类
		JsonTool.toBean(json, TestBean1.class);
	}
	System.out.println("JsonTool:"+(System.currentTimeMillis() - beginTime1));
	
	long beginTime2 = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) {
		// 使用Gson 操作 工具将JSON字符串封装到实体类
		Gson gson = new Gson();
		gson.fromJson(json, TestBean1.class);
	}
	System.out.println("Gson:"+(System.currentTimeMillis() - beginTime2));




- MI3 得到的数据

		10-12 10:07:32.270: I/System.out(8509): JsonTool:6208
		10-12 10:07:41.958: I/System.out(8509): Gson:9687

- Haier S1001LS pad 得到的数据

		10-12 10:06:38.080: I/System.out(6360): JsonTool:2607
		10-12 10:06:42.890: I/System.out(6360): Gson:4811

- OPPO 1107 得到的数据
		
		10-12 10:09:51.474: I/System.out(23315): JsonTool:3529
		10-12 10:09:59.254: I/System.out(23315): Gson:7774

可以看出：

- MI3 Gson用时是JsonTool的**1.56**倍；
- Haier S1001LS Gson用时是JsonTool的**1.84**倍；
- OPPO 1107 Gson用时是JsonTool的**2.20**倍；

**JsonTool效率大约是Gson的2倍**


## License

    Copyright 2011, 2012 Chris Banes

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.