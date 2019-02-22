package org.kasapbasi.week20190301;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=(ImageView) findViewById(R.id.imageView);
    }

    public void FotoCek(View v){

        //Toast.makeText(this," ŞİPŞAK",Toast.LENGTH_LONG).show();

        Intent myInt = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(myInt,1967);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    if(requestCode==1967) {
        Toast.makeText(this, " ŞİPŞAK", Toast.LENGTH_LONG).show();
        Bitmap rsm= (Bitmap) data.getExtras().get("data");

        im.setImageBitmap(rsm);

    }

    }
}
