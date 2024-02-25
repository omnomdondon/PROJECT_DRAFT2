package com.example.project_draft2;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.animation.Animation;
        import android.view.animation.ScaleAnimation;
        import android.widget.Button;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView balloonImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        balloonImageView = findViewById(R.id.balloon);
        Button startButton = findViewById(R.id.start_btn);

        startButton.setOnClickListener(v -> startGame());
    }

    private void startGame() {
        // Define the maximum size (scaled factor)
        final float maxScale = 1.5f;

        // Define the animation
        ScaleAnimation scaleAnimation = new ScaleAnimation(
                1.0f, maxScale, // From X scale to maxScale
                1.0f, maxScale, // From Y scale to maxScale
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot point X relative to the center of view
                Animation.RELATIVE_TO_SELF, 0.5f  // Pivot point Y relative to the center of view
        );

        scaleAnimation.setDuration(1000); // Animation duration in milliseconds
        scaleAnimation.setFillAfter(true); // Keep the final state after the animation

        balloonImageView.startAnimation(scaleAnimation);
    }
}
