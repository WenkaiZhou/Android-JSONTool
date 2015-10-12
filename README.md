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

以实例中的数据`testbean1.json`为例进行Json to Bean操作得到时间：

**测试代码**

	String json = LocalFileUtils.getStringFormAsset(this, "testbean1.json");
	
	long beginTime1 = System.currentTimeMillis();
    // 使用JSONTool 操作 工具将JSON字符串封装到实体类
    TestBean1 testBean1 = JsonTool.toBean(json, TestBean1.class);
	System.out.println("JsonTool JSON to Bean:"+(System.currentTimeMillis() - beginTime1));
	long beginTime2 = System.currentTimeMillis();
	// 使用JSONTool 操作 工具将实体类封装到JSON字符串
	JsonTool.toJson(testBean1);
	System.out.println("JsonTool Bean to JSON:"+(System.currentTimeMillis() - beginTime2));

	long beginTime3 = System.currentTimeMillis();
    // 使用Gson 操作 工具将JSON字符串封装到实体类
	Gson gson = new Gson();
    TestBean1 _testBean1 = gson.fromJson(json, TestBean1.class);
	System.out.println("Gson JSON to Bean:"+(System.currentTimeMillis() - beginTime3));
	long beginTime4 = System.currentTimeMillis();
	// 使用Gson 操作 工具将实体类封装到JSON字符串
	gson.toJson(_testBean1);
	System.out.println("Gson Bean to JSON:"+(System.currentTimeMillis() - beginTime4));


- MI3 得到的数据

		10-12 13:43:34.079: I/System.out(17361): JsonTool JSON to Bean:8
		10-12 13:43:34.085: I/System.out(17361): JsonTool Bean to JSON:7
		10-12 13:43:34.106: I/System.out(17361): Gson JSON to Bean:20
		10-12 13:43:34.123: I/System.out(17361): Gson Bean to JSON:18

- Haier S1001LS pad 得到的数据

		10-12 13:48:53.179: I/System.out(16611): JsonTool JSON to Bean:4
		10-12 13:48:53.189: I/System.out(16611): JsonTool Bean to JSON:3
		10-12 13:48:53.199: I/System.out(16611): Gson JSON to Bean:15
		10-12 13:48:53.209: I/System.out(16611): Gson Bean to JSON:6

- OPPO 1107 得到的数据
		
		10-12 13:38:35.346: I/System.out(3894): JsonTool JSON to Bean:8
		10-12 13:38:35.356: I/System.out(3894): JsonTool Bean to JSON:7
		10-12 13:38:35.376: I/System.out(3894): Gson JSON to Bean:28
		10-12 13:38:35.396: I/System.out(3894): Gson Bean to JSON:15

可以看出：

- MI3
	- JSON to Bean Gson用时是JsonTool的**2.50**倍；
	- Bean to JSON Gson用时是JsonTool的**2.57**倍；
- Haier S1001LS
	- JSON to Bean Gson用时是JsonTool的**3.75**倍；
	- Bean to JSON Gson用时是JsonTool的**2.00**倍；
- OPPO 1107
	- JSON to Bean Gson用时是JsonTool的**3.50**倍；
	- Bean to JSON Gson用时是JsonTool的**2.14**倍；

**JsonTool效率是Gson的2.5倍以上**


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