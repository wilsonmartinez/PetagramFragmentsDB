package com.wmartinez.devep.petagramfragments.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wmartinez.devep.petagramfragments.R;
import com.wmartinez.devep.petagramfragments.adapter.MascotaAdaptador;
import com.wmartinez.devep.petagramfragments.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {


    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas, listaMascotas;
    public MascotaAdaptador adaptador;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);//Es a setContentView en un Activity

        listaMascotas   = (RecyclerView)view.findViewById(R.id.rvMascotas);
        rvMascotas      = (RecyclerView)view.findViewById(R.id.rvMascotas);

        final LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
        // Inflate the layout for this fragment
        return view;
    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        rvMascotas.setAdapter(adaptador);
    }

    public void  inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Sack", 4 ,R.drawable.perro));
        mascotas.add(new Mascota("Ander", 2 ,R.drawable.perro2));
        mascotas.add(new Mascota("Aro", 3 ,R.drawable.perro3));
        mascotas.add(new Mascota("Bego", 2 ,R.drawable.perro4));
        mascotas.add(new Mascota("Barbie", 2 ,R.drawable.gata));
        mascotas.add(new Mascota("Ergo", 5 ,R.drawable.gato));
        mascotas.add(new Mascota("Bob", 5 ,R.drawable.pajaro));
    }

}
