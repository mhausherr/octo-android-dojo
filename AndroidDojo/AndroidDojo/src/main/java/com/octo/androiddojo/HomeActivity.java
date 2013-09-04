package com.octo.androiddojo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_home)
public class HomeActivity extends RoboActivity {

    @InjectView(R.id.button_send)
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("sms:0621795734");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.putExtra("sms_body", "Je vais être en retard j'ai beaucoup de boulot");
                startActivity(intent);
            }
        });
    }
    
}
