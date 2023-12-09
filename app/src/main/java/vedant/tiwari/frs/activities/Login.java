package vedant.tiwari.frs.activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import vedant.tiwari.frs.R;
import vedant.tiwari.frs.databinding.LoginScreenBinding;

public class Login extends AppCompatActivity {

    LoginScreenBinding binding;
    private static final int CAMERA_PERMISSION_CODE = 100;
    private static final int STORAGE_PERMISSION_CODE = 101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = LoginScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        checkPermission(android.Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);
        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        Animation slide_mid_top = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_mid_top);
        new Handler().postDelayed(() -> {
            binding.loginLl.startAnimation(slide_up);
//            binding.mainLogo.startAnimation(slide_mid_top);
            binding.loginLl.setVisibility(View.VISIBLE);
        }, 1000);
        new Handler().postDelayed(() -> {
//            binding.mainLogo.startAnimation(slide_mid_top);
        }, 1500);

        binding.signIn.setOnClickListener(v -> startActivity(new Intent(Login.this, GetStartedScreen.class)));
        binding.loginWithOTP.setOnClickListener(v -> startActivity(new Intent(Login.this, OTPVerification.class)));
    }

    public void checkPermission(String permission, int requestCode)
    {
        // Checking if permission is not granted
        if (ContextCompat.checkSelfPermission(Login.this, permission) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(Login.this, new String[] { permission }, requestCode);
        }
        else {
            Toast.makeText(Login.this, "Permission already granted", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == CAMERA_PERMISSION_CODE) {

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(Login.this, "Camera Permission Granted", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(Login.this, "Camera Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}