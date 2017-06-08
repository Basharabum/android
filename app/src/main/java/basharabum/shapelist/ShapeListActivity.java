package basharabum.shapelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class ShapeListActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView shapeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_list);

        initViews();
    }

    private void initViews() {

        shapeList = (RecyclerView) findViewById(R.id.shapes_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        ShapeListAdapter adapter = new ShapeListAdapter(getShapes());
        shapeList.setLayoutManager(layoutManager);
        shapeList.setAdapter(adapter);
    }

    private ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("Rectangle", "Blue", "Red Rectangle", "no description"));
        shapes.add(new Shape("Circle", "Green", "Green Circle", "no description"));
        shapes.add(new Shape("Line", "Blue", "Blue Line", "no description"));
        shapes.add(new Shape("Rectangle", "Green", "Green Rectangle", "no description"));
        shapes.add(new Shape("Circle", "Red", "Red Circle", "no description"));
        shapes.add(new Shape("Line", "Blue", "Green Line", "no description"));
        return shapes;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.shapelist_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                Intent intentAddShapeActivity = new Intent(this, AddShapeActivity.class);
                startActivity(intentAddShapeActivity);
                break;

            case R.id.exit:
                Intent intent = new Intent(this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}
