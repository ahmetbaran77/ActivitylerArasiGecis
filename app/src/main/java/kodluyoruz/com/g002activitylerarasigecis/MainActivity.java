package kodluyoruz.com.g002activitylerarasigecis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //TODO 1-Button'u burada tanımlıyoruz
    Button activity_main_btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 2-initView ve initEvent adlı iki metot tanımı yapın.
        //TODO 2.1 initView içinde java - xml eşleştirmelerini
        //TODO 2.2 initEvent 'ta ise component'lere ait işlemler yapacağız.
        //TODO 2.3 Böylece kod karmaşasını engellemiş olacağız

        initView();
        initEvent();

    }


    private void initView() {
        //TODO 3 Java - Xml eşleştirmelerini initView metotu içerisinde yapıyoruz
        activity_main_btnGo = (Button) findViewById(R.id.activity_main_btnGo);
    }

    private void initEvent() {
        //TODO 4 Button onClick tanımlaması yapıyoruz

        activity_main_btnGo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        //TODO 5 Intent tanımı yapıp parantez içine var olan Activity , geçmek istediğimiz activity'yi yazıyoruz

        Intent intent = new Intent(MainActivity.this, DashBoardActivity.class);

        //TODO 5.1 startActivity metoduna yazdığımız intent'i veriyoruz Bu şekilde diğer activity'ye geçeceğiz.
        startActivity(intent);

    }
}
