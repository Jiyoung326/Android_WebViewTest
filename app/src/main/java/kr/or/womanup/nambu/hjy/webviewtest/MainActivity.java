package kr.or.womanup.nambu.hjy.webviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient()); //크롬창이 안 뜨고 웹뷰에 뜨게 하기

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true); //자바스크립트 설정 보여주기
        webView.loadUrl("https://www.google.com");

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        WebBtnClickListener listener = new WebBtnClickListener();
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
    }

    class WebBtnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int id = view.getId();
            if(id==R.id.button1){
                webView.loadUrl("https://google.com");
            }else if(id==R.id.button2){
                webView.loadUrl("https://www.naver.com");
            }else if(id==R.id.button3){
                webView.loadUrl("https://www.youtube.com/");
            }
        }
    }
}