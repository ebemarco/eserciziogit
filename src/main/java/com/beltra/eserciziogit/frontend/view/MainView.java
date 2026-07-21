package com.beltra.eserciziogit.frontend.view;

import com.vaadin.flow.router.Route;
import com.beltra.eserciziogit.frontend.components.CardComponent;
import com.beltra.eserciziogit.frontend.layouts.ExampleLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

@Route("")
public class MainView extends VerticalLayout {
    public MainView() {

        // link alla view HelloWorld
        add(new RouterLink("Hello world view", HelloWorldView.class));

        // Aggiungo le componenti grafiche offerte da ExampleLayout alla MainView 
        add( new ExampleLayout() );


        // Aggiungo una serie di card con contenuti testuali alla MainView
        add(new CardComponent());
        
        setSizeFull();
    }
}
