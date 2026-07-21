package com.beltra.eserciziogit.frontend.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.card.Card;
import com.vaadin.flow.component.card.CardVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;

public class CardComponent extends Card {

    public CardComponent() {

        // Titolo della card
        setTitle(new Div("Viaggi"));
        setSubtitle(new Div("Elenco dei viaggi effettuati"));


        // Componenti grafici che ci voglio mettere dentro, in questo caso due paragrafi di testo
        Paragraph p1 = new Paragraph(
                """
                        ABCDE
                        """);

        Paragraph p2 = new Paragraph(
                """
                        FGHIJKLMNOPQRSTUVWXYZ
                        """);
        
        Button consultaButton = new Button("Consulta");
        //Button learnMoreButton = new Button("Learn More");

        add(p1, p2);

        addToFooter(consultaButton/*  , learnMoreButton */);
        

        // do un po' di stile alla card
        addThemeVariants(CardVariant.LUMO_ELEVATED);

        


       
    }
}
