<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %> 
<portlet:defineObjects />

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/guestbook/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>

<aui:form action="${addEntryURL}" name="<portlet:namespace />fm">

        <aui:fieldset>

            <aui:input name="name" ></aui:input>
            <aui:input name="message"></aui:input>
            <aui:input name="email"></aui:input>
            <liferay-ui:input-date name="createDate"></liferay-ui:input-date>

        </aui:fieldset>

        <aui:button-row>
	
            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="${viewURL}"></aui:button>

        </aui:button-row>
</aui:form>