package co.think.adapter;

import java.util.ArrayList;

import co.think.pojo.Cell;
import co.think.spotbook.R;
import co.think.utils.ImageDownloader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CellAdapter extends BaseAdapter{
	
	private ArrayList<Cell> cells = new ArrayList<Cell>();
	private final ImageDownloader imageDownloader = new ImageDownloader();
	//private Book book = new Book();
	
	public CellAdapter (ArrayList<Cell> cells){
		this.cells = cells;
	}

	@Override
	public int getCount() {
		return cells.size();
	}

	@Override
	public Object getItem(int arg0) {
		return cells.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}
	
	public ImageDownloader getImageDownloader() {
        return imageDownloader;
    }

	@Override
	public View getView(int index, View view, ViewGroup parent) {
		if (view == null){
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			view = inflater.inflate(R.layout.cell, parent, false);
		}
		
		Cell cell = cells.get(index);
		imageDownloader.download(cell.getBook(), (ImageView) view.findViewById(R.id.book_image));
		
		return view;
	}
}
