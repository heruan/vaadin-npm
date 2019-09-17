package to.lova.vaadin.npm.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * A component providing a root layout for the application.
 */
@Tag("axians-app-layout")
@JsModule("@axians/axians-app-layout/dist/axians-app-layout.js")
@NpmPackage(value = "@axians/axians-app-layout", version = "1.0.0")
public class AppLayout extends Component implements HasComponents {

}
