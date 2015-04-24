
package com.example.segment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.segment_layout.R;
import com.simple.widgets.SegmentView;
import com.simple.widgets.SegmentView.OnItemCheckedListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_radio);

        SegmentView rGroup = (SegmentView) findViewById(R.id.rg);
        // 设置纵向排列
        rGroup.setOrientation(SegmentView.VERTICAL);
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

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
