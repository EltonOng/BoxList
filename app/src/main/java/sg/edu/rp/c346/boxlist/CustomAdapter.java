package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16043971 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Box> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) parent_context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(layout_id, parent, false);
        }
        ImageView ivColor = convertView.findViewById(R.id.imageViewBox);
        Box currentItem = boxList.get(position);
        if (currentItem.getColor().equals("Blue")){
            ivColor.setImageResource(R.drawable.blue_box);
        }
        else if(currentItem.getColor().equals("Orange")){
            ivColor.setImageResource(R.drawable.orange_box);
        }
        else if (currentItem.getColor().equals("Brown")){
            ivColor.setImageResource(R.drawable.brown_box);
        }

        return convertView;
    }
}
