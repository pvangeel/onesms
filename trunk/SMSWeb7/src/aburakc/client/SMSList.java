package aburakc.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Button;

public class SMSList implements EntryPoint {
	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final SMSServiceAsync smsServiceAsync = GWT
			.create(SMSService.class);
	
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		Button btnRefresh = new Button("Refresh");
		rootPanel.add(btnRefresh, 82, 36);
		
		
	}
}
