package wolfie.client.demos;

import com.google.gwt.core.client.GWT;
import com.vaadin.client.widget.grid.datasources.ListDataSource;
import com.vaadin.client.widgets.Grid;
import com.vaadin.shared.ui.Connect;
import wolfie.ClientGrid1View;
import wolfie.client.GridBaseDemoWidget;
import wolfie.client.Pojo;

public class ClientGrid1Widget extends GridBaseDemoWidget {

    @Connect(ClientGrid1View.class)
    public static class ClientGrid1WidgetConnector extends GridBaseConnector<ClientGrid1Widget> {
        @Override
        protected ClientGrid1Widget createWidget() {
            return GWT.create(ClientGrid1Widget.class);
        }
    }

    public ClientGrid1Widget() {
        grid.setDataSource(new ListDataSource<Pojo>(new Pojo("Hello"), new Pojo("World")));
        grid.addColumn(new Grid.Column<String, Pojo>() {
            @Override
            public String getValue(Pojo row) {
                return row.getField();
            }
        }).setHeaderText("Pojo field");
        grid.setSelectionMode(Grid.SelectionMode.NONE);
    }
}
