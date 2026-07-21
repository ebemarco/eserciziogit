package com.beltra.eserciziogit.frontend.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("hello-world") // available on /hello-world
public class HelloWorldView extends VerticalLayout {   
    public HelloWorldView() {
        add(new H1("Hello, World!"));

        add(new H3("This is a simple Vaadin application with Spring Boot."));



        // link alla view MainView
        add(new RouterLink("Torna alla pagina principale", MainView.class));
    }
}
