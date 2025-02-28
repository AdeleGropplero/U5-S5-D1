package com.epicode.projects.Esercizio.service;

import com.epicode.projects.Esercizio.D2.Ordine;
import com.epicode.projects.Esercizio.D2.Tavolo;
import com.epicode.projects.Esercizio.Menu;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //Classe service annotazione service
public class OrderService {
    @Autowired
    @Qualifier("menu")
    ObjectProvider<Menu> menuProvider;

    @Autowired
    @Qualifier("tavolo1")
    ObjectProvider<Tavolo> tavolo1Provider;

    @Autowired
    @Qualifier("ordine1")
    ObjectProvider<Ordine> ordine1Provider;

    public Menu createMenu(){
        return  menuProvider.getObject(); //con getObject vado a leggere l'oggetto e lo ritorno
    }

    public Tavolo createTable(){
        return  tavolo1Provider.getObject();
    }

    public Ordine createOrdine1(){
        return  ordine1Provider.getObject();
    }



}
