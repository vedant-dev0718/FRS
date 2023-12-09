package vedant.tiwari.frs.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Setting extends AppCompatActivity {

    vedant.tiwari.frs.databinding.SettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = vedant.tiwari.frs.databinding.SettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}