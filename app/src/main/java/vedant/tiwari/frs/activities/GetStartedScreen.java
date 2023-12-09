package vedant.tiwari.frs.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import vedant.tiwari.frs.R;
import vedant.tiwari.frs.databinding.GetStartedScreenBinding;

public class GetStartedScreen extends AppCompatActivity {

    GetStartedScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GetStartedScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GetStartedScreen.this, DashBoard.class));
            }
        });

        binding.locationDropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog(GetStartedScreen.this,
                        R.style.AppBottomSheetDialogTheme);

                View view = LayoutInflater.from(GetStartedScreen.this).inflate(R.layout.fliter_overlay_viewholder,
                        (LinearLayout) findViewById(R.id.design_bottom_sheet));
                dialog.setContentView(view);


                dialog.show();
            }
        });


    }
}