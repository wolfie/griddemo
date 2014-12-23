package wolfie.client.demos;

import com.google.gwt.core.client.GWT;
import com.vaadin.client.widget.escalator.FlyweightCell;
import com.vaadin.client.widget.escalator.Row;
import com.vaadin.shared.ui.Connect;
import wolfie.Escalator1View;
import wolfie.client.EscalatorBaseDemoWidget;
import wolfie.client.SimpleEscalatorUpdater;

public class Escalator1Widget extends EscalatorBaseDemoWidget {

    @Connect(Escalator1View.class)
    public static class Escalator1Connector extends EscalatorBaseConnector<Escalator1Widget> {
        @Override
        protected Escalator1Widget createWidget() {
            return GWT.create(Escalator1Widget.class);
        }
    }

    public Escalator1Widget() {
        escalator.getBody().insertRows(0, 1);
        escalator.getColumnConfiguration().insertColumns(0, 1);
        escalator.getBody().setEscalatorUpdater(new SimpleEscalatorUpdater() {
            @Override
            public void update(Row row, Iterable<FlyweightCell> cellsToUpdate) {
                for (FlyweightCell cell : cellsToUpdate) {
                    cell.getElement().setInnerText("Hello World");
                }
            }
        });
    }
}
