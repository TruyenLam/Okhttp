package com.it.okhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetURL extends AppCompatActivity {
    Button checkurl;
    EditText edturl;
    TextView txtnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_url);

        checkurl= findViewById(R.id.buttonURL);
        edturl= findViewById(R.id.editTexturl);
        txtnd=findViewById(R.id.textViewNoidung);
        //anhxa();

        checkurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //new Geturl().execute("http://"+edturl.getText().toString().trim());
                Toast.makeText(GetURL.this,"nhan nut",Toast.LENGTH_LONG).show();
            }
        });
    }
//    class Geturl extends AsyncTask<String,String,String>{
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .connectTimeout(15, TimeUnit.SECONDS)//thời gian kết thúc kết nối mặt định 10s
//                .writeTimeout(10,TimeUnit.SECONDS)
//                .readTimeout(15,TimeUnit.SECONDS)
//                .retryOnConnectionFailure(true)//cố gắng thực hiện kết nối.
//                .build();
//        @Override
//        protected String doInBackground(String... strings) {
//            Request.Builder builder = new Request.Builder();
//            builder.url(strings[0]);
//
//            //thực hiện
//            Request request = builder.build();
//
//            //trả giá trị về
//            try {
//                Response response = okHttpClient.newCall(request).execute();
//                return response.body().string();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//        @Override
//        //nhan laij gia tri
//        protected void onPostExecute(String s) {
//            if(!s.equals("")) {
//                txtnd.append(s);
//            }else {
//                Toast.makeText(GetURL.this,"đường dẫn bị lỗi",Toast.LENGTH_LONG).show();
//            }
//
//            super.onPostExecute(s);
//        }
//    }
//
    private void anhxa() {
//        checkurl= findViewById(R.id.buttonURL);
//        edturl= findViewById(R.id.editTexturl);
//        txtnd=findViewById(R.id.textViewNoidung);
    }

}
