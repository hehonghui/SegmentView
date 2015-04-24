# SegmentView
This is a Android Segment Control ( View ) like iOS


## 效果图
![gif](tab.gif)

## 使用
1、 引用SegmentView工程;      
2、在项目的xml中加入如下代码 :       

```xml
<com.simple.widgets.SegmentView xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/rg"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_centerHorizontal="true"
    android:layout_gravity="top|center"
    android:layout_margin="10dp"
    android:background="@drawable/segment_shape"
    android:gravity="center"
    android:orientation="horizontal" />
```   
3、 代码中设置tabs和回调。

```java
SegmentView rGroup = (SegmentView) findViewById(R.id.rg);
// 设置tabs
rGroup.setTabs(new String[] {
                "主页", "朋友圈", "搜索"
        });
// 设置点击事件
rGroup.setOnItemCheckedListener(new OnItemCheckedListener() {

      @Override
      public void onCheck(RadioButton button, int position, String title) {
             Toast.makeText(getApplicationContext(),
                        "checked id = " + position + ", title = " + title,
                        Toast.LENGTH_SHORT).show();
      }
 });
```

## License 

```
The MIT License (MIT)

Copyright (c) 2015 Mr.Simple

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
