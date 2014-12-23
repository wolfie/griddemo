package wolfie;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;

public class Welcome extends CustomComponent implements View {
    public final Label label = new Label("", ContentMode.HTML);
    public Welcome() {
        setCompositionRoot(label);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        String names = "";
        for (String viewName : MainUI.getCurrent().getViewNames()) {
            names +="<a href=\"#!"+viewName+"\">"+viewName+"</a><br>";
        }
        label.setValue(names);
    }
}
