package com.example.inicio_sesion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.ViewHolder> {

    List<Categoria> categorias;

    public CategoriaAdapter(List<Categoria> categorias){

        this.categorias = categorias;

    }



    @NonNull
    @Override
    public CategoriaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_producto, viewGroup, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoriaAdapter.ViewHolder holder, int position) {

        holder.tvcategoria.setText(categorias.get(position).nombre);
        Picasso.get().load(categorias.get(position).imagen).into(holder.imvCategoria);

    }

    @Override
    public int getItemCount() {
        return categorias.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvcategoria;
        ImageView imvCategoria;
        CardView cvCategoria;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvcategoria = itemView.findViewById(R.id.tvCategoria);
            imvCategoria = itemView.findViewById(R.id.imvCategoria);
            cvCategoria = itemView.findViewById(R.id.cvCategoria);

        }
    }
}
