package ctrl.don.animatelottie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    MyAdapter adapter;
    LinearLayoutManager mLayoutManager;


    List<String> myString ;

    LottieAnimationView lottieAnimationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        lottieAnimationView = (LottieAnimationView) findViewById(R.id.animation_view);

        lottieAnimationView.setAnimation("checked_done_.json");
        lottieAnimationView.loop(true);
        lottieAnimationView.playAnimation();

        myString = new ArrayList<>();

        for(int i = 0;i<10;i++){
            myString.add(i,"data " + i);
        }

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        adapter = new MyAdapter(myString,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
