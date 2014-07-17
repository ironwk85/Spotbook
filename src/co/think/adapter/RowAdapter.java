package co.think.adapter;

import java.util.ArrayList;

import co.think.pojo.Book;
import co.think.pojo.Cell;
import co.think.pojo.Row;

import co.think.spotbook.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.lucasr.twowayview.TwoWayView;

public class RowAdapter extends BaseAdapter{
	
	private ArrayList<Row> rows = new ArrayList<Row>();
	private ArrayList<Cell> cellsLeyendo = new ArrayList<Cell>();
	private ArrayList<Cell> cellsRecomendaciones = new ArrayList<Cell>();
	private ArrayList<Cell> cellsAyA = new ArrayList<Cell>();
	private ArrayList<Cell> cellsHorror = new ArrayList<Cell>();
	private ArrayList<Cell> cellsClasicos = new ArrayList<Cell>();
	private CellAdapter cellAdapter;
	Toast mToast;
	
	public RowAdapter(){
		cellsLeyendo.add(new Cell(new Book(19,null,null,"http://www.spotbook.co/books/19.png",null)));
		cellsLeyendo.add(new Cell(new Book(20,null,null,"http://www.spotbook.co/books/20.png",null)));
		cellsLeyendo.add(new Cell(new Book(5,null,null,"http://www.spotbook.co/books/5.png",null)));
		
		cellsRecomendaciones.add(new Cell(new Book(21,null,null,"http://www.spotbook.co/books/21.png",null)));
		cellsRecomendaciones.add(new Cell(new Book(24,null,null,"http://www.spotbook.co/books/24.png",null)));
		cellsRecomendaciones.add(new Cell(new Book(6,null,null,"http://www.spotbook.co/books/6.png",null)));
		cellsRecomendaciones.add(new Cell(new Book(23,null,null,"http://www.spotbook.co/books/23.png",null)));
		cellsRecomendaciones.add(new Cell(new Book(9,null,null,"http://www.spotbook.co/books/9.png",null)));
		
		cellsAyA.add(new Cell(new Book(1,null,null,"http://www.spotbook.co/books/1.png",null)));
		cellsAyA.add(new Cell(new Book(16,null,null,"http://www.spotbook.co/books/16.png",null)));
		cellsAyA.add(new Cell(new Book(17,null,null,"http://www.spotbook.co/books/17.png",null)));
		cellsAyA.add(new Cell(new Book(18,null,null,"http://www.spotbook.co/books/18.png",null)));
		
		cellsHorror.add(new Cell(new Book(7,null,null,"http://www.spotbook.co/books/7.png",null)));
		cellsHorror.add(new Cell(new Book(8,null,null,"http://www.spotbook.co/books/8.png",null)));
		cellsHorror.add(new Cell(new Book(11,null,null,"http://www.spotbook.co/books/11.png",null)));
		cellsHorror.add(new Cell(new Book(13,null,null,"http://www.spotbook.co/books/13.png",null)));
		cellsHorror.add(new Cell(new Book(14,null,null,"http://www.spotbook.co/books/14.png",null)));
		cellsHorror.add(new Cell(new Book(22,null,null,"http://www.spotbook.co/books/22.png",null)));
		
		cellsClasicos.add(new Cell(new Book(2,null,null,"http://www.spotbook.co/books/2.png",null)));
		cellsClasicos.add(new Cell(new Book(3,null,null,"http://www.spotbook.co/books/3.png",null)));
		cellsClasicos.add(new Cell(new Book(4,null,null,"http://www.spotbook.co/books/4.png",null)));
		cellsClasicos.add(new Cell(new Book(10,null,null,"http://www.spotbook.co/books/10.png",null)));
		cellsClasicos.add(new Cell(new Book(12,null,null,"http://www.spotbook.co/books/12.png",null)));
		cellsClasicos.add(new Cell(new Book(15,null,null,"http://www.spotbook.co/books/15.png",null)));
		
		rows.add(new Row("Etás leyendo",cellsLeyendo));
		rows.add(new Row("Te recomendamos",cellsRecomendaciones));
		rows.add(new Row("Acción y acentura",cellsAyA));
		rows.add(new Row("Horror",cellsHorror));
		rows.add(new Row("Clásicos",cellsClasicos));
	}

	@Override
	public int getCount() {
		return rows.size();
	}

	@Override
	public Object getItem(int arg0) {
		return rows.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int index, View view, ViewGroup parent) {
		if (view == null){
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			view = inflater.inflate(R.layout.row, parent, false);
		}
		
		Row row = rows.get(index);
		TextView text = (TextView) view.findViewById(R.id.section_title);
		text.setText(row.getText());
		
		TwoWayView listView = (TwoWayView) view.findViewById(R.id.horizontal_list);
		mToast = Toast.makeText(view.getContext(), "", Toast.LENGTH_SHORT);
		
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View child, int position,
                    long id) {
            	ImageView image = (ImageView) child.findViewById(R.id.book_image);
            	Book clickedBook = (Book) image.getTag();
            	mToast.setText("celda:"+ clickedBook.getId());
                mToast.show();
            }
        });
		
		cellAdapter = new CellAdapter(row.getCells());
		listView.setAdapter(cellAdapter);
		
		return view;
	}

}
