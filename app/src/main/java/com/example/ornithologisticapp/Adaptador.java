package com.example.ornithologisticapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderAdapter> {

    ArrayList<ListaAve> listaAve;

    public Adaptador(ArrayList<ListaAve> listaAves){
        this.listaAve = listaAves;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vi = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_ave,null, false);
        return new ViewHolderAdapter(vi);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolderAdapter holder, int position) {
        holder.nombre.setText(listaAve.get(position).getNombreAve());
        holder.fecha.setText(listaAve.get(position).getFechaEnc());
        holder.comment.setText(listaAve.get(position).getComment());

    }

    @Override
    public int getItemCount() {
        return listaAve.size();
    }

    public class ViewHolderAdapter extends RecyclerView.ViewHolder {

        TextView nombre, fecha, comment;
        ImageView img;

        public ViewHolderAdapter(@NonNull View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.txtNombre);
            fecha = itemView.findViewById(R.id.txtFechaEnc);
            comment =  itemView.findViewById(R.id.txtComent);
        }
    }
}
