package com.beltra.eserciziogit.frontend.layouts;

import java.util.List;

import com.beltra.eserciziogit.backend.model.Contact;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ExampleLayout extends SplitLayout {

    public ExampleLayout() {
        Grid<Contact> grid = new Grid<>(Contact.class);
        grid.setColumns("name", "email", "phone");
        grid.setItems(List.of(
            new Contact("John Doe", "john@doe.com", "123 456 789"),
            new Contact("Jane Doe", "jane@doe.com", "987 654 321")
        ));

        VerticalLayout form = new VerticalLayout();

        TextField nameField = new TextField("Name");
        TextField emailField = new TextField("Email");
        TextField phoneField = new TextField("Phone");
        Button saveButton = new Button("Save");
        Button cancelButton = new Button("Cancel");

        form.add(
            nameField,
            emailField,
            phoneField,
            new HorizontalLayout(saveButton, cancelButton)
        );

        setSizeFull();
        setSplitterPosition(70);
        addToPrimary(grid);
        addToSecondary(form);
    }
}