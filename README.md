## Esercitazione GIT e GITHUB

- Sviluppatori:
    - `ebemarco` di Reply 
    - `marcoBelt99` è il mio personale

Progetto:
- *Frontend*: Vaadin &rarr; `ebemarco`
- *Backend*: Java + Vaadin 24 + Spring Boot + PostgreSQL &rarr; `marcoBelt99`

*Manager Progetto*: `ebemarco`


LOGICA APPLICATIVO / ESERCIZIO:  ... 


[https://www.baeldung.com/vaadin](https://www.baeldung.com/vaadin)

1. Inizializzo un repository GIT : `git init`

2. Divido il progetto in backend e frontend (con due omonime cartelle)

3. ebemarco crea la classe frontend `ExampleLayout.java`

4. ebemarco fa un `git add .` per aggiungere tutti i file

5. ebemarco fa `git commit -m "Primo commit"`

6. Ora ebemarco *pubblica* il repository e lo collega a GitHub:
    - Su GitHub, creo il nuovo repository e lo chiamo `eserciziogit`
    - Poi, collego il repository remoto al mio locale `git remote add origin https://github.com/ebemarco/eserciziogit.git` (origin è il nome che viene dato di default al repo remoto)
    - Per vedere tutti i branch attivi, fare: `git brach` (a questo punto dovrei avere solo quello master)
    - quindi, fare: `git push -u origin master` (con questo comando ho mandato i file del mio repository locale a quello remoto)

7. marcoBelt99 può ora clonarsi il repo con `git clone  https://github.com/ebemarco/eserciziogit.git` 
8. ebemarco ora aggiunge ai collaboratori marcoBelt99
9. marcoBelt99 va in https://github.com/notifications e accetta la collaborazione
10. ora marcoBelt99 può fare dei push
11. entrambi i colleghi possono fare anche dei pull








