package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

     private Context context;

     private List<ActionFigure> lstActionFIgure;

    public Adaptador(Context context, List<ActionFigure> lstActionFIgure) {
        this.context = context;
        this.lstActionFIgure = lstActionFIgure;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modeloText.setText(lstActionFIgure.get(position).getNomedaimagem());
        holder.modeloImagem.setImageResource(lstActionFIgure.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return lstActionFIgure.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView modeloText;

        ImageView modeloImagem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modeloText = itemView.findViewById(R.id.modeloText);
            modeloImagem = itemView.findViewById(R.id.modeloImagem);
        }
    }
}
