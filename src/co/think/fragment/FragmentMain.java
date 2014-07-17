package co.think.fragment;

import co.think.adapter.RowAdapter;
import co.think.spotbook.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentMain extends Fragment{
	
	RowAdapter rowAdapter;

	@Override
	   public View onCreateView(LayoutInflater inflater,
	      ViewGroup container, Bundle savedInstanceState) {
			View view = inflater.inflate(R.layout.main_fragment, container, false);
			ListView listView = (ListView) view.findViewById(R.id.rows_list);
			rowAdapter = new RowAdapter();
			listView.setAdapter(rowAdapter);
			
			return view;
	   }
}
