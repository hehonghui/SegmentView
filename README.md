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
