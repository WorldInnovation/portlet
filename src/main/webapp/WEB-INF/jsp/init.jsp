<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<portlet:defineObjects/>
<liferay-theme:defineObjects/>
<c:set var="ns" scope="request"><portlet:namespace/></c:set>

<portlet:renderURL var="alternativeViewUrl">
    <portlet:param name="render" value="alternative-view"/>
</portlet:renderURL>

<portlet:actionURL var="actionOneUrl">
    <portlet:param name="action" value="action-one"/>
</portlet:actionURL>

<portlet:actionURL var="actionTwoUrl">
    <portlet:param name="action" value="action-two"/>
</portlet:actionURL>

<portlet:resourceURL var="resourceOneUrl" id="resource-one">
    <portlet:param name="action" value="action-one"/>
</portlet:resourceURL>


<script type="text/javascript">
    window.MYDepartment = {
        depAll:  '<portlet:resourceURL id="depAll"/>',
        editDepartment:  '<portlet:resourceURL id="editDepartment"/>',
        depSave:  '<portlet:resourceURL id="depSave"/>',
        deleteDep:  '<portlet:resourceURL id="deleteDep"/>',
        getDepName:  '<portlet:resourceURL id="getDepName"/>',
        employeesList:  '<portlet:resourceURL id="employeesList"/>',
        employeeEdit:  '<portlet:resourceURL id="employeeEdit"/>',
        empSave:  '<portlet:resourceURL id="empSave"/>',
        empDelete:  '<portlet:resourceURL id="empDelete"/>',
        ns: '<portlet:namespace/>',
        depId: '<portlet:namespace/>'+ 'id'
    };
</script>

