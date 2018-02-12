package ctrl.don.animatelottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.List;

/**
 * Created by GideonST on 2/12/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<String> myString;
    Context context;


    public MyAdapter(List<String> myString, Context context) {
        this.myString = myString;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        holder.textView.setText(myString.get(position));


    }

    @Override
    public int getItemCount() {
        return myString.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
//        private LottieAnimationView lottieAnimationView;


        public MyViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_main);
//            lottieAnimationView = itemView.findViewById(R.id.lottie);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    startCheckAnimation();
                }
            });
        }

   /*     private void startCheckAnimation() {
            ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f).setDuration(500);
            animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    lottieAnimationView.setProgress((Float) valueAnimator.getAnimatedValue());
                }
            });


            if (lottieAnimationView.getProgress() == 0f) {
                animator.start();
            } else {
                lottieAnimationView.setProgress(0f);
            }
        }*/
    }
}
