package wolfie.client;

import com.google.gwt.user.client.ui.Composite;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.client.ui.SimpleManagedLayout;
import com.vaadin.client.widgets.Grid;

public class GridBaseDemoWidget extends Composite {
    public abstract static class GridBaseConnector<T extends GridBaseDemoWidget> extends AbstractComponentConnector implements SimpleManagedLayout {
        protected abstract T createWidget();

        @Override
        public T getWidget() {
            return (T) super.getWidget();
        }

        @Override
        public void layout() {
            getWidget().grid.onResize();
        }
    }

    protected final Grid grid = new Grid();

    public GridBaseDemoWidget() {
        initWidget(grid);
    }
}
