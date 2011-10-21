package aburakc.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;

public class SMSList implements EntryPoint {
	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final SMSServiceAsync smsServiceAsync = GWT
			.create(SMSService.class);
	
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setSize("100%", "100%");
		
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.EM);
		rootPanel.add(dockLayoutPanel, 10, 10);
		dockLayoutPanel.setSize("100%", "100%");
		
		Button btnAaa = new Button("aaa");
		dockLayoutPanel.addWest(btnAaa, 7.7);
		
		Button btnRefresh = new Button("Refresh");
		dockLayoutPanel.add(btnRefresh);
		
		
	}
}
