package virtual.meeting.moi.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daasuu.ahp.AnimateHorizontalProgressBar;
import virtual.meeting.moi.R;
import virtual.meeting.moi.utils.Helper;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AnimateHorizontalProgressBar progressBar = (AnimateHorizontalProgressBar) findViewById(R.id.animate_progress_bar);
        progressBar.setMax(1500);
        progressBar.setProgressWithAnim(1500);

        final Helper helper = new Helper(this);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, helper.getLoggedInUser() != null ? MainActivity.class : SignInActivity.class));
            finish();
        }, 3000);
    }
}
