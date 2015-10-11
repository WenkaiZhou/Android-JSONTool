# Android-JSONTool

## How to use ##

**JSON to Bean Example**


	String jsonStr = LocalFileUtils.getStringFormAsset(this, "test.json");
	// 使用JSON 操作 工具将JSON字符串封装到实体类
	YourBean newsCenter = JsonTool.toBean(jsonStr, YourBean.class);

**Bean to JSON Example**

	// 使用JSON 操作 工具将实体类封装到JSON字符串
	String toJson = JsonTool.toJson(yourBean);

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