package ac.id.poltekkampar.login;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class MainActivity extends Activity {
    Button b1, b2;
    EditText ed1, ed2;
    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btnLogin);
        b2 = (Button) findViewById(R.id.btnCancel);
        ed1 = (EditText) findViewById(R.id.editUser);
        ed2 = (EditText) findViewById(R.id.editPass);
        tx1 = (TextView) findViewById(R.id.textView2);
        tx1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set username dan password dengan "admin"
                if (ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    //kondisi jika login benar
                    Toast.makeText(getApplicationContext(), "Login Sukses",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    MainActivity.this.startActivity(intent);
                    finish();

                } else {

                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("User Name Yang Anda Masukkan Salah")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}
