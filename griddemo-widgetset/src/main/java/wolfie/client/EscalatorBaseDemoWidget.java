package wolfie.client;

import com.google.gwt.user.client.ui.Composite;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.client.ui.SimpleManagedLayout;
import com.vaadin.client.widgets.Escalator;

public class EscalatorBaseDemoWidget extends Composite {
    public abstract static class EscalatorBaseConnector<T extends EscalatorBaseDemoWidget> extends AbstractComponentConnector implements SimpleManagedLayout {
        protected abstract T createWidget();

        @Override
        public T getWidget() {
            return (T) super.getWidget();
        }

        @Override
        public void layout() {
            getWidget().escalator.onResize();
        }
    }

    protected final Escalator escalator = new Escalator();

    public EscalatorBaseDemoWidget() {
        initWidget(escalator);
    }
}
