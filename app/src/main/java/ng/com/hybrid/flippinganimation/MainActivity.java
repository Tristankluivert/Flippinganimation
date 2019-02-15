package ng.com.hybrid.flippinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class MainActivity extends AppCompatActivity {

    PageCurlView pageCurlView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pageCurlView =findViewById(R.id.page_curlview);
        List<Integer> page_id = new ArrayList<>();
        page_id.add(R.drawable.aicrypto);
        page_id.add(R.drawable.borutotransparentimage);
        page_id.add(R.drawable.kakashitransparent);
        page_id.add(R.drawable.preview);

        pageCurlView.setCurlView(page_id);
        pageCurlView.setCurlSpeed(65);
    }
}
