package vedant.tiwari.frs.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import vedant.tiwari.frs.adapter.Adapter;
import vedant.tiwari.frs.databinding.DashboardBinding;

public class DashBoard extends AppCompatActivity {

    DashboardBinding binding;
    private final static int REQUEST_IMAGE_CAPTURE = 124;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Adapter adapter = new Adapter();
        binding.dashboardRv.setAdapter(adapter);

        binding.setting.setOnClickListener(v -> startActivity(new Intent(DashBoard.this, Setting.class)));

        binding.camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(
//                        MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(
//                        intent, REQUEST_IMAGE_CAPTURE);
                startActivity(new Intent(DashBoard.this, FaceDetection.class));
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode,
                data);
        if (requestCode == REQUEST_IMAGE_CAPTURE
                && resultCode == RESULT_OK) {
            Bundle extra = data.getExtras();
            Bitmap bitmap = (Bitmap) extra.get("data");

        }
    }




}