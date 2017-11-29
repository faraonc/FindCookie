package com.example.faraonc.findcookie;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class MainActivity extends AppCompatActivity {

    Bitmap bMp1;
    Bitmap bMp2;
    boolean state = false;
    ImageView bg;
    TextView prompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bMp1 = BitmapFactory.decodeResource(getResources(), R.drawable.after_cookb);
        this.bMp2 = BitmapFactory.decodeResource(getResources(), R.drawable.before_cookie);
        this.bg = (ImageView) findViewById(R.id.android_cookie_image_view);
        this.prompt = (TextView) findViewById(R.id.status_text_view);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        if(!state) {
            char tmp[] = {'I', ' ', 'a', 'm', ' ', 's', 'o', ' ', 'f', 'u', 'l', 'l'};
            this.prompt.setText(tmp, 0, tmp.length);
            this.bg.setImageBitmap(this.bMp1);
            state = true;
        }else{
            char tmp[] = {'I', ' ', 'a', 'm', ' ', 's', 'o', ' ', 'h', 'u', 'n', 'g', 'r','y'};
            this.prompt.setText(tmp, 0, tmp.length);
            this.bg.setImageBitmap(this.bMp2);
            state = false;
        }
    }
}