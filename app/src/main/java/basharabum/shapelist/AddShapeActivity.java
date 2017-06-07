package basharabum.shapelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddShapeActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatSpinner shapeSpinner;
    private AppCompatSpinner colorSpinner;

    private EditText shapeTitleEditText;
    private EditText shapeDescriptionEditText;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_shape);

        shapeTitleEditText = (EditText) findViewById(R.id.TitleEditText);
        shapeDescriptionEditText = (EditText) findViewById(R.id.DescriptionEditText);
        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(this);

        shapeSpinner = (AppCompatSpinner) findViewById(R.id.shape_spinner);
        String[] shapesArray = new String[]{"Rectangle", "Circle", "Line"};
        ArrayAdapter<String> shapeAdapter = new ArrayAdapter<String>(this,
                R.layout.item_spinner, shapesArray);
        shapeSpinner.setAdapter(shapeAdapter);
        shapeSpinner.setSelection(0);

        colorSpinner = (AppCompatSpinner) findViewById(R.id.color_spinner);
        String[] colorArray = new String[]{"Red", "Green", "Blue"};
        ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>(this,
                R.layout.item_spinner, colorArray);
        colorSpinner.setAdapter(colorAdapter);
        colorSpinner.setSelection(0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addButton:
                String shapeTitle = shapeTitleEditText.getText().toString();
                String shapeDescription = shapeDescriptionEditText.getText().toString();
                if ((shapeTitle.length() == 0) || (shapeDescription.length() == 0)) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please fill in all fields", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Intent intent = new Intent(this, ShapeListActivity.class);
                    startActivity(intent);
                }
                break;
        }
    }
}
