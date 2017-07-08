package stu.zhuye.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "You clicked Button 2", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent("stu.zhuye.activitytest.ACTION_START");
                intent2.addCategory("stu.zhuye.activitytest.MY_CATEGORY");
                startActivity(intent2);
            }
        });
    }
}
