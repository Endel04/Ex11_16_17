package kr.hs.emirim.w2036.ex11_16_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] itemArrs = {"코로나", "내이름은칸", "블랙", "러브망고", "블랙위도우", "너의이름은", "귀멸의칼날:무한열차편", "크루엘라", "날씨의아이", "플립"};
    int[] posterIds = {R.drawable.i01, R.drawable.i02, R.drawable.i03, R.drawable.i04, R.drawable.i05,
                       R.drawable.i06, R.drawable.i07, R.drawable.i08, R.drawable.i09, R.drawable.i10};
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("스피너와 영화 포스터");
        Spinner spinner1 = findViewById(R.id.spinner1);
        imgv = findViewById(R.id.imgv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, andriod.R.layout.simple_spinner_item, itemArrs);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgv.setImageResource(posterIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}