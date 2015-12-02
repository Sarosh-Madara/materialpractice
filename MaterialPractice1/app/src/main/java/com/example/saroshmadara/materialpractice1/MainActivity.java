package com.example.saroshmadara.materialpractice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;

import io.codetail.animation.SupportAnimator;
import io.codetail.animation.ViewAnimationUtils;

public class MainActivity extends AppCompatActivity {

    private static boolean sHidden = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout myView = (RelativeLayout) findViewById(R.id.reveal);
        Button btn = (Button) findViewById(R.id.revealbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int cx = myView.getLeft() + myView.getRight();
                int cy = myView.getTop();

                int radius = Math.max(myView.getWidth(), myView.getHeight());

                SupportAnimator animator = ViewAnimationUtils.createCircularReveal(myView, cx, cy, 0, radius);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
                animator.setDuration(1000);
                SupportAnimator reverseAnimator = animator.reverse();

                if(sHidden){
                    animator.start();
                    sHidden = false;
                    myView.setVisibility(View.VISIBLE);
                }else {
                    reverseAnimator.addListener(new SupportAnimator.AnimatorListener() {
                        @Override
                        public void onAnimationStart() {
                            sHidden = true;
                        }

                        @Override
                        public void onAnimationEnd() {
                            myView.setVisibility(View.INVISIBLE);
                            sHidden = true;
                        }

                        @Override
                        public void onAnimationCancel() {

                        }

                        @Override
                        public void onAnimationRepeat() {

                        }
                    });
                    reverseAnimator.start();
                }

            }
        });



    }
}
