package ru.itsjava.service;

import ru.itsjava.domain.Notebook;
import ru.itsjava.service.NotebookService;

public class NotebookServiceImpl implements NotebookService {

    @Override
    public Notebook getNotebook() {
        return new Notebook("Macbook");
    }
}
