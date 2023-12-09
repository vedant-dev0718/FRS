package vedant.tiwari.frs.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import vedant.tiwari.frs.databinding.OtpVerificationBinding;

public class OTPVerification extends AppCompatActivity {

    OtpVerificationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = OtpVerificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}