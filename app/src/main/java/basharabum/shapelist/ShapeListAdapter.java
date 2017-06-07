package basharabum.shapelist;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ShapeListAdapter extends RecyclerView.Adapter<ShapeViewHolder> {

    private ArrayList<Shape> shapes;

    public ShapeListAdapter(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public ShapeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ShapeViewHolder(parent, R.layout.item_shape);
    }

    @Override
    public void onBindViewHolder(ShapeViewHolder holder, int position) {
        holder.bindView(shapes.get(position));
    }

    @Override
    public int getItemCount() {
        return shapes.size();
    }
}
