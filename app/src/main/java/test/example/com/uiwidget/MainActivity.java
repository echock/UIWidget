package test.example.com.uiwidget;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;


public class MainActivity extends Activity implements View.OnClickListener {
    private Button button;

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView  = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(false);
                progressDialog.show();
//                progressDialog.dismiss();
//         if(progressBar.getVisibility()==View.GONE){
//             progressBar.setVisibility(View.VISIBLE);
//         }else{
//             progressBar.setVisibility(View.GONE);
//         }
//         int progress = progressBar.getProgress();
//                progress=progress+10;
//                progressBar.setProgress(progressx);
//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("This is a Dialog");
//                dialog.setMessage("Something Important");
//                dialog.setCancelable(false);
//                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//                dialog.show();

                break;
            default:
                break;
        }
    }

}