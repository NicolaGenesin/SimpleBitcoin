package com.z1911.bitcoin.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;
import com.github.ksoichiro.android.observablescrollview.ScrollUtils;
import com.github.ksoichiro.android.observablescrollview.Scrollable;
import com.nineoldandroids.view.ViewHelper;
import com.z1911.bitcoin.Activity.Base.BaseActivity;
import com.z1911.bitcoin.Const;
import com.z1911.bitcoin.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @param <S> Scrollable
 */
public abstract class ScrollableActivity<S extends Scrollable> extends BaseActivity implements ObservableScrollViewCallbacks {

    protected int mFlexibleSpaceImageHeight;
    protected int mIntersectionHeight;
    @Bind(R.id.parallax_box)
    View mBoxFilter;
    @Bind(R.id.list_background)
    View mListBackgroundView;
    @Bind(R.id.header)
    FrameLayout mHeader;
    @Bind(R.id.button_info)
    FloatingActionButton fab;
    @Bind(R.id.image)
    ImageView mBitcoinImage;

    private boolean mReady;
    private long DELAY = 200;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        ButterKnife.bind(this);

        mFlexibleSpaceImageHeight = getResources().getDimensionPixelSize(R.dimen.flexible_space_image_height);
        mIntersectionHeight = getResources().getDimensionPixelSize(R.dimen.intersection_height);
        fab.setImageResource(R.drawable.info);

        final S scrollable = createScrollable();

        ((TextView) findViewById(R.id.title)).setText(getTitle());
        setTitle(null);

        ScrollUtils.addOnGlobalLayoutListener((View) scrollable, new Runnable() {
            @Override
            public void run() {
                mReady = true;
                updateViews(scrollable.getCurrentScrollY(), false);
            }
        });
    }

    protected abstract S createScrollable();

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {
        updateViews(scrollY, true);
    }

    @Override
    public void onDownMotionEvent() {
    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
    }

    protected void updateViews(int scrollY, boolean animated) {
        if (!mReady) {
            return;
        }
        // Translate mBoxViewPager
        ViewHelper.setTranslationY(mBoxFilter, -scrollY / 2);

        // Translate header
        ViewHelper.setTranslationY(mHeader, getHeaderTranslationY(scrollY));
    }

    protected float getHeaderTranslationY(int scrollY) {
        int headerTranslationY = -mIntersectionHeight;
        if (0 <= -scrollY + mFlexibleSpaceImageHeight + mIntersectionHeight) {
            headerTranslationY = -scrollY + mFlexibleSpaceImageHeight;
        }
        return headerTranslationY;
    }

    @OnClick(R.id.button_info)
    public void onButtonInfoClick() {
        hideFab();
        launch(ScrollableActivity.this, new View[]{mBitcoinImage});
    }

    private void hideFab() {
    }

    @Override
    public void onResume() {
        super.onResume();
        showFab();
    }

    private void showFab() {
    }

    public void launch(final BaseActivity activity, final View[] transitionView) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                activity,
                                Pair.create(transitionView[0], Const.EXTRA_IMAGE)
                        );
                Intent intent = new Intent(activity, SummaryActivity.class);
                ActivityCompat.startActivity(activity, intent, options.toBundle());
            }
        }, DELAY);
    }
}
