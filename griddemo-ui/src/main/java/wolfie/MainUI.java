package wolfie;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.AbstractSingleComponentContainer;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Theme("griddemo")
@Widgetset("wolfie.GridDemoWidgetset")
public class MainUI extends UI {

    public static class DemoNavigator extends Navigator {
        private final List<String> viewNames = new ArrayList<>();

        public DemoNavigator(UI ui, AbstractSingleComponentContainer cc) {
            super(ui, cc);
        }

        public void addView(Class<? extends View> view) {
            String name = view.getSimpleName();
            addView(name, view);
            viewNames.add(name);
        }

        public List<String> getViewNames() {
            return Collections.unmodifiableList(viewNames);
        }
    }

    private DemoNavigator navigator;

    @WebServlet(urlPatterns = "/*", name = "MainUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MainUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        navigator = new DemoNavigator(this, this);
        navigator.addView("", Welcome.class);
        navigator.addView(ClientGrid1View.class);
        navigator.addView(Escalator1View.class);
        setSizeFull();
    }

    public List<String> getViewNames() {
        return navigator.getViewNames();
    }

    public static MainUI getCurrent() {
        return (MainUI) UI.getCurrent();
    }
}
