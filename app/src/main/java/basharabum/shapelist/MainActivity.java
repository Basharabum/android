package basharabum.shapelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button loginBtn;
    private EditText usernameEditText, passwordEditText;
    private TextView registrationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button) findViewById(R.id.login);
        loginBtn.setOnClickListener(this);

        usernameEditText = (EditText) findViewById(R.id.username);

        passwordEditText = (EditText) findViewById(R.id.password);

        registrationTextView = (TextView) findViewById(R.id.registration);
        registrationTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.login:
                String usernameStr = usernameEditText.getText().toString();
                String passwordStr = usernameEditText.getText().toString();
                if ((usernameStr.length() == 0) || (passwordStr.length() == 0)) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please, enter name and password!", Toast.LENGTH_SHORT);
                    toast.show();

                } else {
                    Intent intentToStartActivity = new Intent(this, ShapeListActivity.class);
                    startActivity(intentToStartActivity);
                }
                break;

            case R.id.registration:
                Intent intentRegistrationActivity = new Intent(this, RegistrationActivity.class);
                startActivity(intentRegistrationActivity);
                break;
        }
    }
}
