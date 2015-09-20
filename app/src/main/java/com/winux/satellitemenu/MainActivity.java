package com.winux.satellitemenu;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animator.AnimatorListener {

    private ImageView ivMenu,ivA,ivB,ivC,ivD,ivE,ivF;
    private boolean isShowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ivA = (ImageView) findViewById(R.id.iv_a);
        ivB = (ImageView) findViewById(R.id.iv_b);
        ivC = (ImageView) findViewById(R.id.iv_c);
        ivD = (ImageView) findViewById(R.id.iv_d);
        ivE = (ImageView) findViewById(R.id.iv_e);
        ivF = (ImageView) findViewById(R.id.iv_f);
        ivMenu = (ImageView) findViewById(R.id.iv_menu);
        ivA.setOnClickListener(cl);
        ivB.setOnClickListener(cl);
        ivC.setOnClickListener(cl);
        ivD.setOnClickListener(cl);
        ivE.setOnClickListener(cl);
        ivF.setOnClickListener(cl);
    }

    View.OnClickListener cl = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView current = (ImageView)v;
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_click);
            current.clearAnimation();
            current.startAnimation(animation);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btShowItem(View view) {
        if (!isShowing){
            isShowing = true;
            ivA.setVisibility(View.VISIBLE);
            ivB.setVisibility(View.VISIBLE);
            ivC.setVisibility(View.VISIBLE);
            ivD.setVisibility(View.VISIBLE);
            ivE.setVisibility(View.VISIBLE);
            ivF.setVisibility(View.VISIBLE);
            // ivMenu.setPivotX();
            Animator animator = AnimatorInflater.loadAnimator(this, R.animator.animator_menu_normal);
            animator.setTarget(ivMenu);
            animator.start();
            Animator animatorA = AnimatorInflater.loadAnimator(this, R.animator.animator_a_normal);
            animatorA.setTarget(ivA);
            animatorA.start();
            Animator animatorB = AnimatorInflater.loadAnimator(this, R.animator.animator_b_normal);
            animatorB.setTarget(ivB);
            animatorB.start();
            Animator animatorC = AnimatorInflater.loadAnimator(this, R.animator.animator_c_normal);
            animatorC.setTarget(ivC);
            animatorC.start();
            Animator animatorD = AnimatorInflater.loadAnimator(this, R.animator.animator_d_normal);
            animatorD.setTarget(ivD);
            animatorD.start();
            Animator animatorE = AnimatorInflater.loadAnimator(this, R.animator.animator_e_normal);
            animatorE.setTarget(ivE);
            animatorE.start();
            Animator animatorF = AnimatorInflater.loadAnimator(this, R.animator.animator_f_normal);
            animatorF.setTarget(ivF);
            animatorF.start();



        }else {
            isShowing = false;
            Animator animator = AnimatorInflater.loadAnimator(this, R.animator.animator_menu_back);
            animator.setTarget(ivMenu);
            animator.start();
            Animator animatorA = AnimatorInflater.loadAnimator(this, R.animator.animator_a_back);
            animatorA.setTarget(ivA);
            animatorA.start();
            Animator animatorB = AnimatorInflater.loadAnimator(this, R.animator.animator_b_back);
            animatorB.setTarget(ivB);
            animatorB.start();
            Animator animatorC = AnimatorInflater.loadAnimator(this, R.animator.animator_c_back);
            animatorC.setTarget(ivC);
            animatorC.start();
            Animator animatorD = AnimatorInflater.loadAnimator(this, R.animator.animator_d_back);
            animatorD.setTarget(ivD);
            animatorD.start();
            Animator animatorE = AnimatorInflater.loadAnimator(this, R.animator.animator_e_back);
            animatorE.setTarget(ivE);
            animatorE.start();
            Animator animatorF = AnimatorInflater.loadAnimator(this, R.animator.animator_f_back);
            animatorF.setTarget(ivF);
            animatorF.start();
            animatorF.addListener(this);

        }

    }

    @Override
    public void onAnimationStart(Animator animation) {

    }

    @Override
    public void onAnimationEnd(Animator animation) {
        ivA.setVisibility(View.GONE);
        ivB.setVisibility(View.GONE);
        ivC.setVisibility(View.GONE);
        ivD.setVisibility(View.GONE);
        ivE.setVisibility(View.GONE);
        ivF.setVisibility(View.GONE);

    }

    @Override
    public void onAnimationCancel(Animator animation) {

    }

    @Override
    public void onAnimationRepeat(Animator animation) {

    }
}
