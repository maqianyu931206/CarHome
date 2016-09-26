package com.maqianyu.carhome.ui.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.maqianyu.carhome.R;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by dllo on 16/9/23.
 * 欢迎页
 */
public class WelcomeActivity extends AbsBaseActivity {
    private TextView welcomeTimeTv;
    private TextView welcomeTv;
    private ImageView welcomeImg;

    @Override
    protected int setLayout() {
        return R.layout.welcome_activity;
    }

    @Override
    protected void initViews() {
        welcomeImg  =byView(R.id.welcome_img);
        welcomeTimeTv = byView(R.id.welcome_time_tv);
        welcomeTv = byView(R.id.welcome_tv);

    }

    @Override
    protected void initDatas() {
        new ImageTask().execute("http://desk.fd.zol-img.com.cn/t_s1920x1080c5/g5/M00/0F/02/ChMkJlfIAnuIMoqdAAY6fwamaIQAAU5ygEHsOgABjqX331.jpg");
        MyTask myTask =new MyTask();
        myTask.execute(0);

        welcomeTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=  new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public class  ImageTask extends AsyncTask<String ,Integer,Bitmap>{

        @Override
        protected Bitmap doInBackground(String... params) {
        String imgurl = params[0];
            HttpURLConnection connection= null;
            InputStream is = null;
            Bitmap bitmap = null;
            try {
                URL url = new URL(imgurl);
                connection= (HttpURLConnection) url.openConnection();
                if (connection.getResponseCode() == 200){
                    is = connection.getInputStream();
                    bitmap = BitmapFactory.decodeStream(is);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (is != null){
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (connection != null){
                    connection.disconnect();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            welcomeImg.setImageBitmap(bitmap);
        }
    }
    public class MyTask extends AsyncTask<Integer,Integer,String>{

        @Override
        protected String doInBackground(Integer... params) {
            int all = params[0];
            int now = 5;
            while (now > all){
                publishProgress(now);
                now--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            welcomeTimeTv.setText(values[0]+ "");
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            welcomeTimeTv.setText(s);
            Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

}
