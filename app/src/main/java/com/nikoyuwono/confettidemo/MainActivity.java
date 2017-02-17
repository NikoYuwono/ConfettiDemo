package com.nikoyuwono.confettidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.plattysoft.leonids.ParticleSystem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.emitter_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ParticleSystem(MainActivity.this, 80, R.drawable.confeti_purple, 10000)
                        .setSpeedModuleAndAngleRange(0.1f, 0.3f, 180, 270)
                        .setRotationSpeed(144)
                        .setAcceleration(0.00017f, 90)
                        .emitWithGravity(findViewById(R.id.emitter_top_right), 1, 8);

                new ParticleSystem(MainActivity.this, 80, R.drawable.confeti_red, 10000)
                        .setSpeedModuleAndAngleRange(0.1f, 0.3f, 240, 300)
                        .setRotationSpeed(144)
                        .setAcceleration(0.00017f, 90)
                        .emitWithGravity(findViewById(R.id.emitter_top_center), 1, 8);

                new ParticleSystem(MainActivity.this, 80, R.drawable.confeti_white, 10000)
                        .setSpeedModuleAndAngleRange(0.1f, 0.3f, 270, 0)
                        .setRotationSpeed(144)
                        .setAcceleration(0.00017f, 90)
                        .emitWithGravity(findViewById(R.id.emitter_top_left), 1, 8);
            }
        });
    }
}
