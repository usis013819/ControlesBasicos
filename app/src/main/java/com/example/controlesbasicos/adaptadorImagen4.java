package com.example.controlesbasicos;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptadorImagen4 extends BaseAdapter {
    Context context;
    ArrayList<com.example.controlesbasicos.fuentes> dato;
    LayoutInflater layoutInflater;
    com.example.controlesbasicos.fuentes fuentes;

    public adaptadorImagen4(Context context, ArrayList<com.example.controlesbasicos.fuentes> dato){
        this.context = context;
        try {
            this.dato = dato;
        }catch (Exception ex){}
    }

    @Override
    public int getCount() {
        try {
            return dato.size();
        }catch (Exception ex) {
            return 0;
        }
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.item_mostrar, viewGroup, false);
        TextView tvTituMarca = (TextView)itemView.findViewById(R.id.TVlmarca);
        TextView tvTituDescripcion = (TextView)itemView.findViewById(R.id.TVldescripcion);
        TextView tvTituPrecio = (TextView)itemView.findViewById(R.id.TVlprecio);

        ImageView imageView = (ImageView)itemView.findViewById(R.id.img);
        try {
            fuentes = dato.get(i);
            tvTituMarca.setText(fuentes.getNombre());
            tvTituDescripcion.setText(fuentes.getMarca());
            tvTituPrecio.setText(fuentes.getPrecio());

            Bitmap imageBitmap = BitmapFactory.decodeFile(fuentes.getUrlImg());

            imageView.setImageBitmap(imageBitmap);
        }catch (Exception ex){ }
        return itemView;
    }

}
