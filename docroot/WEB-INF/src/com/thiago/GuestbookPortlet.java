package com.thiago;

import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.thiago.model.Entry;
import com.thiago.model.impl.EntryImpl;
import com.thiago.service.EntryLocalServiceUtil;

/**
 * Portlet implementation class GuestbookPortlet
 */
public class GuestbookPortlet extends MVCPortlet {
	public static final Log logger = LogFactoryUtil.getLog(GuestbookPortlet.class.getName());
	
	@Override
	public void init() throws PortletException {
		System.out.println("init");

		super.init();
	}

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		System.out.println("processAction");
		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		super.render(request, response);
	}

	public void addEntry(ActionRequest req, ActionResponse resp) {
		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		
		Entry entry = montaEntry(req, themeDisplay);
		try {
			EntryLocalServiceUtil.validateEntry(entry); 
			EntryLocalServiceUtil.addEntry(entry);
		} catch (SystemException e) {
			logger.error(e);
		}
	}

	private Entry montaEntry(ActionRequest req, ThemeDisplay themeDisplay) {
		String userName = ParamUtil.getString(req, "name");
		String message = ParamUtil.getString(req, "message");
		String email = ParamUtil.getString(req, "email");
		String dataCriacao = req.getParameter("createDate");
		
		themeDisplay.getCompanyGroupId();
		themeDisplay.getCompanyId();
		themeDisplay.getUser().getScreenName();
		
		Entry entry = new EntryImpl();
		entry.setName(userName);
		entry.setMessage(message);
		entry.setCompanyId(themeDisplay.getCompanyId());
		entry.setUserId(themeDisplay.getUserId());
		entry.setGroupId(themeDisplay.getCompanyGroupId());
		entry.setEmail(email);
		entry.setGuestbookId(1l);
		entry.setModifiedDate(new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataCriacaoFormatada = null;
		try {
			dataCriacaoFormatada = sdf.parse(dataCriacao);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		entry.setCreateDate(dataCriacaoFormatada);
		return entry;
	}

}
