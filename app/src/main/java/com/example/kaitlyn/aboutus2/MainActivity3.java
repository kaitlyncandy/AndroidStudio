package com.example.kaitlyn.aboutus2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        import android.content.Intent;

    import android.view.View;

import android.widget.TextView;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        button4 button = (button4) findViewById(R.id.button);

        button.setOnClickListener(new View.onClickListener() {

            @Override

            public void onClick(View v) {

                goToMainActivity();

            }

        });
        button2 button = (button2) findViewById(R.id.button);

        button.setOnClickListener(new View.onClickListener() {

            @Override

            public void onClick(View v) {

                goToMainActivity4();

            }

        });
    }
    private void goToMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
    private void goToMainActivity4() {

        Intent intent = new Intent(this, MainActivity4.class);

        startActivity(intent);

    }
}
