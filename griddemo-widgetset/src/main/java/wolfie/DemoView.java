package wolfie;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.ClientConnector;
import com.vaadin.ui.AbstractComponent;

import java.util.logging.Logger;

public abstract class DemoView extends AbstractComponent implements View {

    public DemoView() {
        setHeight("500px");
        setWidth("400px");
        addStyleName("demoview");
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
