package wolfie.client;

import com.vaadin.client.widget.escalator.EscalatorUpdater;
import com.vaadin.client.widget.escalator.FlyweightCell;
import com.vaadin.client.widget.escalator.Row;

public abstract class SimpleEscalatorUpdater implements EscalatorUpdater {
    @Override
    public void preAttach(Row row, Iterable<FlyweightCell> cellsToAttach) {
    }

    @Override
    public void postAttach(Row row, Iterable<FlyweightCell> attachedCells) {
    }

    @Override
    public void preDetach(Row row, Iterable<FlyweightCell> cellsToDetach) {
    }

    @Override
    public void postDetach(Row row, Iterable<FlyweightCell> detachedCells) {
    }
}
